package com.greatlearning.javafsd.emailapp;

public interface ICredentialService {

	String generatePassword();
	
//	generateEmailAddress(String firstName, 
//			String lastName, String department, 
//				String param4, String param5);
//	
	
	String generateEmailAddress(Employee employee);

	void displayCredentials(Employee employee);
	
}
