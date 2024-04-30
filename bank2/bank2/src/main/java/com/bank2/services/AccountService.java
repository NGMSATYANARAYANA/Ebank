package com.bank2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank2.entity.Account;
import com.bank2.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	
	public List<Account> getAll()
	{
		return accountRepository.findAll();
	}
	
	
	public Account post(Account account)
	{
		return accountRepository.save(account);
	}
	
}
  