package com.bank2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank2.entity.chequeentity;
import com.bank2.repository.chequerepo;


@Service
public class chequeservices {
	
	@Autowired
	private chequerepo repo;
	
	public chequeentity post(chequeentity entity) {
		return repo.save(entity);
		
	}
	
	public List<chequeentity> get(){
		return repo.findAll();
		
		
	}

}
