package com.mortgage.MortgageDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mortgage.MortgageDemo.entity.AreaAddress;

@Repository
public interface AreaAddressRepository extends JpaRepository<AreaAddress, Long>{

	public AreaAddress findBypincode(Long pincode);

//	public AreaAddress findByareaAmountPerFeet(AreaAddress pin);

}
