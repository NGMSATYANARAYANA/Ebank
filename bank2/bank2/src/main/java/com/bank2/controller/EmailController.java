package com.bank2.controller;

import com.bank2.*;
import com.bank2.entity.RegistrationEntity;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.bank2.services.EmailService;
import com.bank2.services.Registrationservice;

	@RestController
	@CrossOrigin("*")
	@RequestMapping("/emailaccount")
	public class EmailController {
	

	    @Autowired
	    private EmailService emailService;
	    
	    @Autowired
	    private Registrationservice registrationservice; 
	    
	    
	    @PostMapping("/accept")
	    public void acceptAccount() {
	        // Logic for accepting account
	        
	        // Send email
   String to = "madhuriajay.aresella@gmail.com";
	    	
//	    RegistrationEntity user = registrationservice.getUserByEmail(email);
//	    	String userString = user.toString();
//	    	System.out.println(userString);
//
////	    	
//	    	String to = userString;
	    	
	        String subject = "Account Accepted";
	        String text = "Your account has been accepted.";
	        emailService.sendEmail(to, subject, text);
	    	
	     
	    }
	    
	    @PostMapping("/reject")
	    public void rejetAccount() {
	        // Logic for accepting account
	        
	        // Send email
	    	 String to = "ngmsatyanarayana@gmail.com";
//	        String to = "sivamiriyala98@gmail.com";
	        String subject = "Account not Accepted";
	        String text = "Your account has been Rejected.";
	        emailService.sendEmail(to, subject, text);
	    }
	}


