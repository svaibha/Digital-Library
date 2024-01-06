package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entites.Author;
import com.example.demo.entites.Book;
import com.example.demo.model.AuthorRequestModel;
import com.example.demo.model.BookRequestModel;
import com.example.demo.model.BookResponseModel;
import com.example.demo.repo.Author_repository;
import com.example.demo.repo.Book_Repository;

@Service
public class BookService {
	
	@Autowired
	Book_Repository Bookrepo;
	@Autowired
	Author_repository authrepo;

	
	//ADD_BOOK
	public BookResponseModel addBook(BookRequestModel Book) {
		BookResponseModel response;
		
		if(Book.getAvailable().equals(null) || Book.getGenre().equals(null)||
			Book.getISBNnumber().equals(null)||Book.getNo_of_pages().equals(null) || Book.getLanguage().equals(null)||Book.getBook_name().equals(null)
			) {
			response = new BookResponseModel(Book.getBook_Id(),Book.getBook_name(),Book.getNo_of_pages(),Book.getLanguage(),Book.getAvailable(),Book.getGenre(),Book.getISBNnumber()
					,404,"Something is missing",Book.getPublishedDate());
		
		}else {
		
			Book book = new Book();
			book.setBook_Name(Book.getBook_name());
			book.setGenre(Book.getGenre());
			book.setISBNnumber(Book.getISBNnumber());
			book.setNo_of_pages(Book.getNo_of_pages());
			book.setLanguage(Book.getLanguage());
			book.setAvailable(Book.getAvailable());
			book.setPublishedDate(Book.getPublishedDate());
			
			Bookrepo.save(book);
			response = new BookResponseModel(book.getBook_Id(),book.getBook_Name(),book.getNo_of_pages(),book.getAvailable(),book.getLanguage(),book.getGenre(),book.getISBNnumber(),200,"Done",book.getPublishedDate());
		
		}
	      return response;
	      
}
	//GET_BOOK WITH ID
	public Optional<Book> getbook(Integer Id) {
		return Bookrepo.findById(Id);
	}
//	public List<Book> getbyname(String Book_Name) {
//		return Bookrepo.findByBookName(Book_Name);
//	}
	
	public void deletebook(Integer Id) {
		 Bookrepo.deleteById(Id);
		 return;
	}
	public BookResponseModel updatebook(BookRequestModel new_book,Integer Id) {
		BookResponseModel response = new BookResponseModel();
		Book book = Bookrepo.findById(Id).get();
		
		if(Objects.nonNull(new_book.getBook_name())&& !"".equalsIgnoreCase(new_book.getBook_name())) {
			book.setBook_Name(new_book.getBook_name());
		}
		if(Objects.nonNull(new_book.getAvailable())&& !"".equalsIgnoreCase(new_book.getAvailable())) {
			book.setAvailable(new_book.getAvailable());
		};
		if(Objects.nonNull(new_book.getGenre())&& !"".equalsIgnoreCase(new_book.getGenre())) {
			book.setGenre(new_book.getGenre());
		};
		if(Objects.nonNull(new_book.getISBNnumber())&& !"".equalsIgnoreCase(new_book.getISBNnumber())) {
			book.setISBNnumber(new_book.getISBNnumber());
		};
		if(Objects.nonNull(new_book.getLanguage())&& !"".equalsIgnoreCase(new_book.getLanguage())) {
			book.setLanguage(new_book.getLanguage());
		};
		if(Objects.nonNull(new_book.getNo_of_pages())&& !"".equals(new_book.getNo_of_pages())) {
			book.setNo_of_pages(new_book.getNo_of_pages());
		};
		if(Objects.nonNull(new_book.getPublishedDate())&& !"".equals(new_book.getPublishedDate())) {
			book.setPublishedDate(new_book.getPublishedDate());
		};
		
		
		Bookrepo.save(book);
		response = new BookResponseModel(book.getBook_Id(),book.getBook_Name(),book.getNo_of_pages(),book.getAvailable(),book.getLanguage(),book.getGenre(),book.getISBNnumber(),200,"Done",book.getPublishedDate());

		return response;
		
	}
	public BookResponseModel Addauthor(Integer Id,Integer AuthorId) {
		BookResponseModel response = new BookResponseModel();
		Book book = Bookrepo.findById(Id).get();
		Author author = authrepo.findById(AuthorId).get();
		
		if(!author.equals(null)) {
			book.setAuthor(author);
		}
		
		Bookrepo.save(book);
		response = new BookResponseModel(book.getBook_Id(),book.getBook_Name(),book.getNo_of_pages(),book.getAvailable(),book.getLanguage(),book.getGenre(),book.getISBNnumber(),200,"Done",book.getPublishedDate());

		return response;
		
	}
	
}
