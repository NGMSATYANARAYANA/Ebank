package com.bank2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.bank2.entity.TransEntity;
import com.bank2.repository.TransRepository;



@Service
public class TransServices {
	@Autowired
      private TransRepository repository;
	
	public TransEntity post(TransEntity trans) {
	 return repository.save(trans);
	
}
	public List<TransEntity> get(){
		return repository.findAll();
	}
	
	
	public Optional<TransEntity> getById(int id)
	{
		return repository.findById(id);
	}

	
}
	