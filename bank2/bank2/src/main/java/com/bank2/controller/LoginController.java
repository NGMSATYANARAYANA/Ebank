package com.bank2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank2.entity.LoginEntity;
import com.bank2.services.LoginService;



@RestController
@CrossOrigin("*")
@RequestMapping("/loginRequest")
public class LoginController {
	@Autowired
	private LoginService service;
	@PostMapping("/save")
	public LoginEntity postAll(@RequestBody LoginEntity request)
	{
		return service.post(request);
	}
	
	
	@GetMapping
	public List<LoginEntity> getAll()
	{
		return service.get();
	}
	
	

}
