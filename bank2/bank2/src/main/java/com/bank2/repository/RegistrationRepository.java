package com.bank2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank2.entity.RegistrationEntity;


@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Integer> {

	 RegistrationEntity findByEmailid(String emailid);
//	 RegistrationEntity findByone(int requestid);
	 
	 }
