package com.bank2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank2.entity.Ddform;
import com.bank2.services.Ddservices;



@RestController
@CrossOrigin("*")
@RequestMapping("/ddfrom")
public class Ddformcontroller {
	@Autowired
	private Ddservices service;
	
	
	  @PostMapping("/save") 
	 public Ddform postAll(@RequestBody Ddform user) { 
	  return service.post(user); 
	 }
	 
	 @GetMapping
		public List<Ddform> getAll1() 
		 { 
		  return service.getAll();
		 } 
	
	 }
