package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Book;
import com.example.demo.model.AuthorRequestModel;
import com.example.demo.model.BookRequestModel;
import com.example.demo.model.BookResponseModel;
import com.example.demo.service.BookService;

@RestController
public class Bookcontroller {
	@Autowired
	BookService bookservice;
	@PostMapping("/Book")
	public BookResponseModel postbook(@RequestBody BookRequestModel bookrequestmodel) {
		return bookservice.addBook(bookrequestmodel);
	}
	@GetMapping("/Book/{Id}")
	@Cacheable(value="Book" ,key="#id")
	public Optional<Book> getBook(@PathVariable Integer Id) {
		return bookservice.getbook(Id);
	}
//	@GetMapping("/Book/{Book_Name}")
//	public List<Book> getByname(@RequestParam String Book_Name) {
//		return bookservice.getbyname(Book_Name);
//	}
	
	@DeleteMapping("Book/{Id}")
	@Cacheable(value="Book" ,key="#id")
	public void deleteBook(@PathVariable Integer Id) {
		bookservice.deletebook(Id);
		return;
	}
	@PutMapping("Book/{Id}")
	public BookResponseModel updatebook(@RequestBody BookRequestModel bookrequestmodel ,@PathVariable Integer Id) {
		return bookservice.updatebook(bookrequestmodel, Id);
	}
	@PutMapping("Book_author")
	public BookResponseModel Addauthor(@RequestParam Integer Book_Id,@RequestParam Integer Author_Id) {
		return bookservice.Addauthor(Book_Id, Author_Id);
	}
	
	
}
