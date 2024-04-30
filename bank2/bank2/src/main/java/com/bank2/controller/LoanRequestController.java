package com.bank2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank2.entity.LoanRequest;
import com.bank2.repository.LoanRequestRepository;



@RestController
@CrossOrigin("*")
@RequestMapping("/loanrequests")
public class LoanRequestController {
	
	@Autowired
    private LoanRequestRepository loanRequestRepository;

    @PostMapping("/save")
    public LoanRequest createLoanRequest(@RequestBody LoanRequest loanRequest) {
        return loanRequestRepository.save(loanRequest);
    }
    @GetMapping
    public List<LoanRequest> getall(){
    	return loanRequestRepository.findAll();
    }

}


