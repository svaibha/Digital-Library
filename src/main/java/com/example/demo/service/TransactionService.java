package com.example.demo.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Book;
import com.example.demo.entites.Card;
import com.example.demo.entites.Transaction;
import com.example.demo.model.Emailresponse;
import com.example.demo.model.TransactionRequestModel;
import com.example.demo.model.TransactionResponseModel;
import com.example.demo.repo.Book_Repository;
import com.example.demo.repo.Card_repo;
import com.example.demo.repo.Transaction_repository;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class TransactionService {
	
@Autowired
kafkaproducerservice kafkaproducerservice;
	
	@Autowired
	Transaction_repository transrepo;
	@Autowired
	Book_Repository book_Repo;
	@Autowired
	Card_repo cardrepo;
	static LocalDate locatdate = LocalDate.now();
	static LocalDate calculatefine = locatdate.plusDays(20);
	
	public static double calculatefine(LocalDate dueDate , double Finerate) {
		long Overdues = ChronoUnit.DAYS.between(dueDate, calculatefine);
		return Math.max(0, Overdues*Finerate);
	}
	
	public TransactionResponseModel starttrans(Integer Book_Id,Integer Crad_Id) {
		TransactionResponseModel response;
		LocalDate futuredate = locatdate.plusDays(15);
		
		Book book = book_Repo.findById(Book_Id).get();
		Card card = cardrepo.findById(Crad_Id).get();
		
		
		double fine_amount = calculatefine(futuredate, 1.5);
		
		if(book.getAvailable().equals("UnAvailabe")) {
			response = new TransactionResponseModel(book,200,"Not Availabe");
		}
		else if(card.getIsIssued() >= 3) {
			response = new TransactionResponseModel(book,200,"More than 3 books Issued");
		}
		else if(card.getStatus().equals("Not Active")) {
			response = new TransactionResponseModel(book,200,"Sorry ! cardNot active");
		}
		else{
			int i =0;
			Transaction transaction = new Transaction();
			book.setAvailable("Unavailable");
			card.setIsIssued(card.getIsIssued()+1);
			transaction.setBook_Id(book);
			transaction.setCard_Id(card);
			card.getTransaction().add(transaction);
			book.getTransaction().add(transaction);
			transaction.setBook_Due_Date(futuredate);
			transaction.setStatus("not Returned");
			transaction.setFine_Amount(fine_amount);
			transaction.setIs_Issued("Yes");
			transaction.setIs_Returned("No");
			transrepo.save(transaction);
			response = new TransactionResponseModel(transaction.getTrans_Id(),transaction.getBook_Id(),transaction.getCard_Id(),transaction.getTrans_Date(),
					transaction.getBook_Due_Date(),transaction.getIs_Issued(),transaction.getIs_Returned(),transaction.getFine_Amount(),
					transaction.getStatus(),
					transaction.getCreated_On(),transaction.getUpdated_On()
					,200,"Transaction successfull");
			
			Emailresponse email = new Emailresponse();
			email.setBookname(book.getBook_Name());
			email.setIssued_date(transaction.getBook_Due_Date());
			email.setFrom("Book_association");
			email.setIssueremail(card.getEmail());
			
			String subject="Book issued details";
			String text="Book with"+ book.getBook_Name()+book.getISBNnumber()+"is issued"+"please return before"+transaction.getBook_Due_Date();
			email.setMsg(text);
			email.setSubject(subject);
			try {
			kafkaproducerservice.sendmsg(email);
			}catch (Exception e) {
				e.printStackTrace();
			}

			
		}
		return response;
	}
	public TransactionResponseModel returnbook(Integer BookId,Integer CardId,Integer finerate) {
		
		TransactionResponseModel response = new TransactionResponseModel();
		Card card = cardrepo.findById(CardId).get();
		Book book = book_Repo.findById(BookId).get();
		LocalDate futuredate = locatdate.plusDays(20);
		if(book.getBook_Id().equals(null)) {
			response = new TransactionResponseModel(book, 200, "BookId not valid");
		}
		if(card.getCard_id().equals(null)) {
			response = new TransactionResponseModel(book, 200, "CardId not valid");
		}
		Transaction book_return = transrepo.findById(CardId).get();
		
		if(book_return.getBook_Id().equals(null)) {
			response = new TransactionResponseModel(book, 200, "TransactionId not valid");
		}
		
		book.setAvailable("Available");
		card.setIsIssued(card.getIsIssued()-1);
		Double fine = calculatefine(book_return.getBook_Due_Date(),finerate);
		book_return.setFine_Amount(fine);
		book_return.setIs_Returned("Yes");
		book_return.setStatus("Returned");
		transrepo.save(book_return);
		cardrepo.save(card);
		book_Repo.save(book);
		response = new TransactionResponseModel(BookId, book, card, book_return.getTrans_Date(), book_return.getBook_Due_Date(), book_return.getFine_Amount(), 202, "Please the fine amount");
		
		return response;
	}
	public Optional<Transaction> getdetails(Integer Trans_Id) {
		return transrepo.findById(Trans_Id);
	}
	public Optional<Transaction> getdetailsByBookId(Integer book_Id) {
		return transrepo.findById(book_Id);
		
	}
	public Optional<Transaction> getdetailsByCardId(Integer card_Id) {
		return transrepo.findById(card_Id);
		
	}


	
}
