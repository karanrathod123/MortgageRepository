package com.mortgage.MortgageDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mortgage.MortgageDemo.entity.RegisterUser;

@Repository
public interface MortgageRegisterRepository extends JpaRepository<RegisterUser, Long> {
	
	

}
