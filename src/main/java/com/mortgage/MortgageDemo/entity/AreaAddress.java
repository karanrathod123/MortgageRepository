package com.mortgage.MortgageDemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AreaAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long pincode;
	private Long areaAmountPerFeet;

	public void setAreaAmountPerFeet(Long areaAmountPerFeet) {
		this.areaAmountPerFeet = areaAmountPerFeet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAreaAmountPerFeet() {
		return areaAmountPerFeet;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}



}
