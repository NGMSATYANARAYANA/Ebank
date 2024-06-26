package com.bank2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank2.entity.LoginEntity;


@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Integer> {

}
