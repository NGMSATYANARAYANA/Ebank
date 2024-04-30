package com.bank2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Repository;

import com.bank2.entity.Ddform;




@Repository
public interface Ddrepository extends JpaRepository<Ddform, String> {
	

}
