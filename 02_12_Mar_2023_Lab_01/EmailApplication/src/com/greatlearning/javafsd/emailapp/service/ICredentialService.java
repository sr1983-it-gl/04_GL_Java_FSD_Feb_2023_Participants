package com.greatlearning.javafsd.emailapp.service;

import com.greatlearning.javafsd.emailapp.model.Employee;

public interface ICredentialService {

	String generatePassword();
	
//	generateEmailAddress(String firstName, 
//			String lastName, String department, 
//				String param4, String param5);
//	
	
	String generateEmailAddress(Employee employee);

	void displayCredentials(Employee employee);
	
}
