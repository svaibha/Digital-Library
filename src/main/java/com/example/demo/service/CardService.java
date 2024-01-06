package com.example.demo.service;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Card;
import com.example.demo.model.BookResponseModel;
import com.example.demo.model.CardRequestModel;
import com.example.demo.model.CardResponseModel;
import com.example.demo.repo.Book_Repository;
import com.example.demo.repo.Card_repo;

@Service
public class CardService {
	
	@Autowired
	Card_repo cardrepo;
	
	public CardResponseModel updatecard(CardRequestModel card_status   ,Integer Id) {
		CardResponseModel response = new CardResponseModel();
		Card card = cardrepo.findById(Id).get();
		
		if(Objects.nonNull(card_status.getEmail())&& !"".equalsIgnoreCase(card_status.getEmail())) {
			card.setEmail(card_status.getEmail());
		}
		if(Objects.nonNull(card_status.getStatus())&& !"".equalsIgnoreCase(card_status.getStatus())) {
			card.setStatus(card_status.getStatus());
		};
		if(Objects.nonNull(card_status.getValidupto())&& !"".equals(card_status.getValidupto())) {
			card.setValidupto(card_status.getValidupto());
		};
		LocalDate localdate = LocalDate.now();
		card.setUpdatedon(localdate);
		cardrepo.save(card);
		
		response = new  CardResponseModel(card.getCard_id(),card.getStatus(),card.getEmail(),card.getCreatedon(),card.getUpdatedon(),card.getValidupto(),200,"Updated");
		return response;
	}
	public Optional<Card> getcard(Integer Id) {
		return cardrepo.findById(Id);
	}
}
