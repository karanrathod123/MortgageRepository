package com.mortgage.MortgageDemo.utility;

public class SalaryException extends RuntimeException {

	public SalaryException(String string) {
		System.err.println("salary should not be less than 10000");
		// TODO Auto-generated constructor stub
	}

}
