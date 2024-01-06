package com.example.demo.service;

import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookResponseModel;
import com.example.demo.model.Emailresponse;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class Kafkaconsumer {

	 @KafkaListener(topics = "book-issued-topic", groupId = "book-issued-group")
	public void consume(ConsumerRecord<String, Emailresponse> email) {
		Emailresponse response = email.value();
		sendBookIssuedEmailNotification(response);
	}
	private void sendBookIssuedEmailNotification(Emailresponse email) {
		 boolean flag = false;

	        //logic
	        //SMTP properties
	        Properties properties = new Properties();
	        properties.put("mail.smtp.auth", true);
	        properties.put("mail.smtp.starttls.enable", true);
	        properties.put("mail.smtp.port", "587");
	        properties.put("mail.smtp.host", "smtp.gmail.com");

	        String username = "yourusername@gmail.com";
	        String password = "xrnkktcrkxcatwln";


	        //session
	        Session session = Session.getInstance(properties, new Authenticator() {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(username, password);
	            }
	        });

	        try {

	            Message message = new MimeMessage(session);
	            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email.getIssueremail()));
	            message.setFrom(new InternetAddress(email.getFrom()));
	            message.setSubject(email.getSubject());
	            message.setText(email.getMsg());
	            Transport.send(message);
	            flag = true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }


	        return ;
	    }

	}

