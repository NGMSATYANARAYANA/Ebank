package com.bank2.controller;

import java.io.NotActiveException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank2.entity.AccountRequest;
import com.bank2.services.AccountreqService;



@RestController
@CrossOrigin("*")
@RequestMapping("/Request")
public class AccountreqController {

	@Autowired
	private AccountreqService service; 
	 
	@PostMapping("/save")
	public AccountRequest postAll(@RequestBody AccountRequest request) throws NotActiveException
	{
		return service.post(request);
	}
	

	@GetMapping
	public List<AccountRequest> getAll()
	{
		return service.get();
	}
}
