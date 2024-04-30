package com.bank2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank2.entity.RegistrationEntityTnx;

@Repository
public interface RegistrationTnxRepository  extends JpaRepository<RegistrationEntityTnx, Integer> {


	boolean existsByRequestidAndStatus(int reqid, String approved);

	
//	RegistrationEntityTnx findByEmail(String emailid);
}
