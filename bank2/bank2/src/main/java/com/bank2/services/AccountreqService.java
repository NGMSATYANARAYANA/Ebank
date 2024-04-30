package com.bank2.services;

import java.io.NotActiveException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank2.ServiceConstants.RegistrationConstantsUtil;
import com.bank2.entity.AccountRequest;
import com.bank2.repository.AccountreqRepository;
import com.bank2.repository.RegistrationTnxRepository;

@Service
public class AccountreqService {

	@Autowired
	private AccountreqRepository repository;
	@Autowired
	private RegistrationTnxRepository registrationTnxRepo;
	
	public AccountRequest post(AccountRequest request) throws NotActiveException {
		boolean isApproved = registrationTnxRepo.existsByRequestidAndStatus(request.getReqid(), RegistrationConstantsUtil.APPROVED);
		if(isApproved) {
		return repository.save(request);
		}
		throw new NotActiveException("Registration Rejected");
			
	}
	
	public List<AccountRequest> get()
	{
		return repository.findAll();
	}
}
 