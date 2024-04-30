package com.bank2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.bank2.services.EmailService;


@SpringBootApplication
public class Bank2Application {

//	@Autowired
//	private EmailService service;
	
	public static void main(String[] args) {
		SpringApplication.run(Bank2Application.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void sendmail() {
//		service.sendEmail("nareshf1996@gmail.com", "accepted", "loan sanctioned");
//		
//	}
}
