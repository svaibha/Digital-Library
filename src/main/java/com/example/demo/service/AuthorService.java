package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Author;
import com.example.demo.entites.Book;
import com.example.demo.model.AuthorRequestModel;
import com.example.demo.model.AuthorResponseModel;
import com.example.demo.model.BookRequestModel;
import com.example.demo.model.BookResponseModel;
import com.example.demo.repo.Author_repository;
import com.example.demo.repo.Book_Repository;

@Service
public class AuthorService {
	@Autowired
	Author_repository authorrepo;
	@Autowired
	Book_Repository bookrepo;
	
	public AuthorResponseModel MapAuthor(AuthorRequestModel Author) {	
		AuthorResponseModel response;
		
		if(Author.getName().equals(null) || Author.getCountry().equals(null)|| Author.getEmail().equals(null)||Author.getAge().equals(null)) {
			response = new AuthorResponseModel(300,"Something missing");
		}
		Author author = new Author();
		author.setName(Author.getName());
		author.setAge(Author.getAge());
		author.setCountry(Author.getCountry());
		author.setEmail(Author.getEmail());
		
		authorrepo.save(author);
		response = new AuthorResponseModel(200,"Done");
		return response;
	}
	
	public List<Book> allBooks(Integer Id) {
			
		return  bookrepo.findAll();
	
	}
	public AuthorResponseModel updatebook(AuthorRequestModel new_author,Integer Id) {
		AuthorResponseModel response = new AuthorResponseModel();
		Author author = authorrepo.findById(Id).get();	
		if(Objects.nonNull(new_author.getName())&& !"".equalsIgnoreCase(new_author.getName())) {
			author.setName(new_author.getName());
		}
		if(Objects.nonNull(new_author.getAge())&& !"".equals(new_author.getAge())) {
			author.setAge(new_author.getAge());
		};
		if(Objects.nonNull(new_author.getCountry())&& !"".equalsIgnoreCase(new_author.getCountry())) {
			author.setCountry(new_author.getCountry());
		};
		if(Objects.nonNull(new_author.getEmail())&& !"".equalsIgnoreCase(new_author.getEmail())) {
			author.setEmail(new_author.getEmail());
		};
		if(Objects.nonNull(new_author.getBook())&& !"".equals(new_author.getBook())) {
			author.setBooklist(author.getBooklist());
		};
		
		authorrepo.save(author);
		response = new AuthorResponseModel(author.getAuthor_Id(),author.getName(),author.getEmail(),author.getAge(),author.getCountry(),200,"Done");

		return response;
		
	}
}
