/*
 * package com.mortgage.MortgageDemo.utility;
 * 
 * import org.springframework.validation.Errors; import
 * org.springframework.validation.Validator;
 * 
 * import com.mortgage.MortgageDemo.entity.RegisterUser;
 * 
 * public class PasswordPairValidator implements Validator {
 * 
 * @Override public boolean supports(Class<?> clazz) { // TODO Auto-generated
 * method stub return clazz.isAssignableFrom(RegisterUser.class); }
 * 
 * @Override public void validate(Object target, Errors errors) { //
 * ValidationUtils.rejectIfEmpty(errors, "name","name.required" ); RegisterUser
 * registerUser=(RegisterUser)target;
 * 
 * if(registerUser.getAge() < 25) {
 * 
 * }if(registerUser.getMonthlySalary() < 10000) {
 * 
 * } }
 * 
 * }
 */