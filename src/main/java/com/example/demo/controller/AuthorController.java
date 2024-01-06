package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Book;
import com.example.demo.model.AuthorRequestModel;
import com.example.demo.model.AuthorResponseModel;
import com.example.demo.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	AuthorService authservice;
	
	@PostMapping("/author")
	public AuthorResponseModel author(@RequestBody AuthorRequestModel autor_info) {
		return authservice.MapAuthor(autor_info);
	}
	
	@GetMapping("/author/{Id}")
	@Cacheable(value="Author" ,key="#id")
	public List<Book> getallBook(@PathVariable Integer Id){
		return authservice.allBooks(Id);
	}
	
}
