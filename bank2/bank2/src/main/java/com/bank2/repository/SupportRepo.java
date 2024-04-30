package com.bank2.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bank2.entity.Support;

public interface SupportRepo extends JpaRepository<Support, String> {

}
