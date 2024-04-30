package com.bank2.repository;

import org.springframework.stereotype.Repository;

import com.bank2.entity.LoanRequest;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LoanRequestRepository extends JpaRepository<LoanRequest, Integer>{

}
