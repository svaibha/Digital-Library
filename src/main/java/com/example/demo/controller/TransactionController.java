package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Transaction;
import com.example.demo.model.TransactionResponseModel;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	TransactionService transactionservice;
	
	@PostMapping("/transaction/{BookId}/{CardId}")
	public TransactionResponseModel startTransaction(@PathVariable Integer BookId,@PathVariable Integer CardId) {
		return transactionservice.starttrans(BookId, CardId);
	}
	@PutMapping("/transaction")
	public TransactionResponseModel bookreturn(@RequestParam Integer  BookId,@RequestParam Integer  CardId,@RequestParam Integer finerate) {
		return transactionservice.returnbook(BookId, CardId,finerate);
	}
	@GetMapping("/transaction/{Trans_Id}")
	@Cacheable(value="Transaction" ,key="#Trans_Id")
	public Optional<Transaction> getdetails(@PathVariable Integer Trans_Id) {
		return transactionservice.getdetails(Trans_Id);
	}
	@GetMapping("/transactionbybook/{bookId}")
	@Cacheable(value="Transaction" ,key="#bookId")
	public Optional<Transaction> getdetailsByBooId(@PathVariable Integer bookId) {
		return transactionservice.getdetailsByBookId(bookId);
	}
	@GetMapping("/transactionbycardId/{cardId}")
	@Cacheable(value="Transaction" ,key="#cardId")
	public Optional<Transaction> getdetailsByCradId(@PathVariable Integer cardId) {
		return transactionservice.getdetailsByBookId(cardId);
	}
	
}
