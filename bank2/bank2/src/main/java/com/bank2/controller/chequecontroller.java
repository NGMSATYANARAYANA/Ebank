package com.bank2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank2.entity.chequeentity;
import com.bank2.services.chequeservices;



@RestController
@CrossOrigin("*")
@RequestMapping("/checkrequest")
public class chequecontroller {

	@Autowired
	private chequeservices service; //here calling services class
	
	@PostMapping("/save")
	public chequeentity postAll(@RequestBody chequeentity entity) {
		return service.post(entity);
	}
	
	@GetMapping
	public List<chequeentity> getAll(){
		return service.get();
	}
}
