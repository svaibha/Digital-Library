package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookRequestModel;
import com.example.demo.model.BookResponseModel;
import com.example.demo.model.Emailresponse;

@Service
public class kafkaproducerservice {

	KafkaTemplate<String , 	Emailresponse> kafkatemplate;
	
	@Autowired
	public kafkaproducerservice(KafkaTemplate<String, Emailresponse> kafkatemplate) {
		this.kafkatemplate = kafkatemplate;
	}
	public void sendmsg(Emailresponse email) {
		kafkatemplate.send("book-issued-topic",email);
	}
}
