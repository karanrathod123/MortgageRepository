package com.mortgage.MortgageDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mortgage.MortgageDemo.entity.LoanOffer;

@Repository
public interface LoanRepository extends JpaRepository<LoanOffer, Long> {

	List<LoanOffer> findByofferAmountLessThan(Long loanoffer);

}
