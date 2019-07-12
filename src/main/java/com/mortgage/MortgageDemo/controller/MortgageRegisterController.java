package com.mortgage.MortgageDemo.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mortgage.MortgageDemo.entity.RegisterUser;
import com.mortgage.MortgageDemo.service.MortgageService;


@RestController
@RequestMapping("/register")
public class MortgageRegisterController {

	@Autowired
	MortgageService mortgageService;
	
	@GetMapping("/getUser")
	public String getRegister(){
		
		return "getUser";
	}
	
	@PostMapping("/saveUser")
	public void saveUser(@RequestBody RegisterUser registerUser ) {
		
		mortgageService.saveUser(registerUser);
		
	}
	
	
	/*
	 * @InitBinder protected void initBinder(WebDataBinder webDataBinder) {
	 * webDataBinder.setValidator(new PasswordPairValidator()); }
	 */
	
	
}
