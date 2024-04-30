package com.bank2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank2.entity.LoginEntity;
import com.bank2.repository.LoginRepository;



@Service
public class LoginService {
	@Autowired
	private LoginRepository repository;
	public LoginEntity post(LoginEntity trans) {
		 return repository.save(trans);
		
	}
		public List<LoginEntity> get(){
			return repository.findAll();
		}
}
