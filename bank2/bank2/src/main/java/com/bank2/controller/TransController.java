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

import com.bank2.entity.TransEntity;
import com.bank2.services.TransServices;






@RestController
@CrossOrigin("*")
@RequestMapping("/transRequest")
public class TransController {
	@Autowired
 private TransServices services;
	@PostMapping("/save")
	public TransEntity postAll(@RequestBody TransEntity request)
	{
		return services.post(request);
	}
	
	
	@GetMapping
	public List<TransEntity> getAll()
	{
		return services.get();
	}
	
	@GetMapping("/{id}")
	public Optional<TransEntity> getOne(@PathVariable int Id)
	{
		return services.getById(Id);
	}

}
