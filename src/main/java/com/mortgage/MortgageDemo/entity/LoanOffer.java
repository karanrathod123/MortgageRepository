package com.mortgage.MortgageDemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Loan_Offers")
public class LoanOffer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String offerName;
	private Long offerAmount;
	
	
	public void setOfferAmount(Long offerAmount) {
		this.offerAmount = offerAmount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public double getOfferAmount() {
		return offerAmount;
	}
	
	
}
