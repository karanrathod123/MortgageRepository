package com.mortgage.MortgageDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mortgage.MortgageDemo.entity.AreaAddress;
import com.mortgage.MortgageDemo.service.AreaAddreeService;

@RestController
@RequestMapping("/areaAddress")
public class AreaAddressController {

	@Autowired
	AreaAddreeService areaAddressService;

	@GetMapping("/userDetails")
	public @ResponseBody List<AreaAddress> getAllAddressDetails() {
		List<AreaAddress> areaAddress = areaAddressService.getAllAddressDetails();
		return areaAddress;

	}

}
