package com.bank2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bank2.entity.Support;
import com.bank2.repository.SupportRepo;

@Service
public class SupportServices {
	@Autowired
	private SupportRepo repo;
	
	public List<Support> getAll() 
	 { 
	   return repo.findAll(); 
	 }
	 public List<Support> getByid1(Support id) 
	 { 
	  return repo.findAll();
	 }
	 public  Support post( Support user) 
	 { 
	  return repo.save(user); 
	 } 

}


