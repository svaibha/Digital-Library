package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Card;
import com.example.demo.model.CardRequestModel;
import com.example.demo.model.CardResponseModel;
import com.example.demo.service.CardService;

@RestController
public class CardController {
	
	@Autowired
	public CardService cardservice;
	
	@PutMapping("/card/{Id}")
	public CardResponseModel updatecard(@RequestBody CardRequestModel card, @PathVariable Integer Id) {
		return cardservice.updatecard(card, Id);
	}
	@GetMapping("/card/{Id}")
	@Cacheable(value="Card" ,key="#Id")
	public Optional<Card> getcard(@PathVariable Integer Id) {
		return cardservice.getcard(Id);
	}
}
