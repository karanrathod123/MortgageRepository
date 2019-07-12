package com.mortgage.MortgageDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortgage.MortgageDemo.entity.AreaAddress;
import com.mortgage.MortgageDemo.repository.AreaAddressRepository;

@Service
public class AreaAddreeService {

	@Autowired
	AreaAddressRepository areaAddressRepository;
	
	public List<AreaAddress> getAllAddressDetails() {
		// TODO Auto-generated method stub
		return areaAddressRepository.findAll();
	}
	


}
