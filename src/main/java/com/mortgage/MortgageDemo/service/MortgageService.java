package com.mortgage.MortgageDemo.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mortgage.MortgageDemo.entity.AreaAddress;
import com.mortgage.MortgageDemo.entity.LoanOffer;
import com.mortgage.MortgageDemo.entity.RegisterUser;
import com.mortgage.MortgageDemo.repository.AreaAddressRepository;
import com.mortgage.MortgageDemo.repository.LoanRepository;
import com.mortgage.MortgageDemo.repository.MortgageRegisterRepository;
import com.mortgage.MortgageDemo.utility.AgeException;
import com.mortgage.MortgageDemo.utility.NotEligibleException;
import com.mortgage.MortgageDemo.utility.SalaryException;

@Service
public class MortgageService {

	@Autowired
	MortgageRegisterRepository repoMortgageRegisterRepository;

	@Autowired
	AreaAddressRepository areaAddress;

	@Autowired
	AreaAddressRepository areAddressRepository1;

	@Autowired
	LoanRepository LoanRepositoryy;

	public void saveUser(RegisterUser registerUser) {

		AreaAddress areaPinCode = areaAddress.findBypincode(registerUser.getPincode());
		System.out.println(">>>>>>>>>>>>>>>>>" + areaPinCode);

		Long calculateValue;
		Double age = registerUser.getAge();
		LocalDate dob=registerUser.getDob();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate)); //2016/11/16
		Long agerequired= ChronoUnit.DAYS.between(dob, localDate);
		Long year = agerequired / 365;
		
		System.err.println(year	+"----");
		
		Double salary = registerUser.getMonthlySalary();
		if (year < 25) {
			throw new AgeException("please enter correct age");
		}
		if (salary < 10000) {
			throw new SalaryException("salary should not be less than 10000");
		}
		if (areaPinCode != null) {
			Long amountPerFeet = areaPinCode.getAreaAmountPerFeet();
			calculateValue = amountPerFeet * registerUser.getAreasize();
			System.out.println(calculateValue + ">>>>>>>>>>>>>>>>>");

			if (calculateValue < 5000000) {
				throw new NotEligibleException("property value is less than 5 Lacs you are not elligible");

			}
			repoMortgageRegisterRepository.save(registerUser);
			Long derivedPropertyValue = (calculateValue * 80) / 100;
		//	Long Loanoffer = calculateValue - derivedPropertyValue;
			getoffer(derivedPropertyValue);

		} else {
			System.err.println("please choose pin code");
		}

	}

	public List<LoanOffer> getoffer(Long loanoffer) {
		List<LoanOffer> loanOffers = LoanRepositoryy.findByofferAmountLessThan(loanoffer);
		System.out.println("Loan Offer are>>>>>>>>>" + loanoffer);
		for (LoanOffer loanOffer2 : loanOffers) {
			System.err.println("Loan offer available are "+loanOffer2.getOfferName());	
		}
		
		// sendEmail();
		return loanOffers;

	}

}
