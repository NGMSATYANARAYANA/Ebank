package com.bank2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank2.entity.Account;
import com.bank2.services.AccountService;

@RestController
@CrossOrigin("*")
@RequestMapping("/account")
public class AcountController {

	@Autowired
	private AccountService service;
	
	
	@GetMapping
	public List<Account> getAll1()
	{
		return service.getAll();
	}
	
	@PostMapping("/holderinfo")
	public Account postAll(@RequestBody Account account)
	{
		return service.post(account);
	}
}
