package com.bank2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank2.entity.Support;
import com.bank2.services.SupportServices;


@RestController
@CrossOrigin("*")
@RequestMapping("/support") 
public class SupportController {

	@Autowired
	private SupportServices service;
	
	@PostMapping("/save")
	public Support postAll(@RequestBody Support user) {
		return service.post(user);
	}
	
	@GetMapping
	public List<Support> getAll(){
		return service.getAll();
	}
}
