package com.bank2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank2.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

}
