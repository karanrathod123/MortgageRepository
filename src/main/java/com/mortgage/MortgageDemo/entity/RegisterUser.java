package com.mortgage.MortgageDemo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "register_userr")
public class RegisterUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	private LocalDate dob;
	private String gender;
	private double monthlySalary;
	private String address;
	private Long pincode;
	private Long areasize;
	private Long panno;
	private double age;
	
	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPanno() {
		return panno;
	}

	public void setPanno(Long panno) {
		this.panno = panno;
	}

	public Long getAreasize() {
		return areasize;
	}

	public void setAreasize(Long areasize) {
		this.areasize = areasize;
	}

	

}
