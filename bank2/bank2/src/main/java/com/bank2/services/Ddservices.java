package com.bank2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank2.entity.Ddform;
import com.bank2.repository.Ddrepository;




@Service
public class Ddservices {
	@Autowired
	private Ddrepository repository;
	
	public List<Ddform> getAll() 
	 { 
	   return repository.findAll(); 
	 } 
	  
	 //getByid 
	 public List<Ddform> getByid1(Ddform id) 
	 { 
	  return repository.findAll();
	 } 
	  
	 //post all 
	 public  Ddform post( Ddform user) 
	 { 
	  return repository.save(user); 
	 } 
	  
	}


