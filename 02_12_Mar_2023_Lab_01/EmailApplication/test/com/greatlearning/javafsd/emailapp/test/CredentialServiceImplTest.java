package com.greatlearning.javafsd.emailapp.test;

import com.greatlearning.javafsd.emailapp.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapp.Employee;
import com.greatlearning.javafsd.emailapp.PasswordGenerator;

public class CredentialServiceImplTest {

	public static void main(String[] args) {
		
//		testEmailAddressGeneration();
		
//		testPasswordGeneration();
		
		testDisplayCredentials();
	}


	static void testEmailAddressGeneration() {
		
		CredentialServiceImpl serviceImpl = 
				new CredentialServiceImpl();
			
		Employee sunil = new Employee("Sunil", "Kumar", "technical");
		
		String emailAddress 
			= serviceImpl.generateEmailAddress(sunil);
		
		System.out.println(emailAddress);		
	}
	
	static void testPasswordGeneration() {
		
		CredentialServiceImpl serviceImpl = 
				new CredentialServiceImpl();

		String password  = serviceImpl.generatePassword();
		System.out.println("Password ->" + password);
		
	}
	
	
	static void testDisplayCredentials() {
		

		CredentialServiceImpl serviceImpl = 
				new CredentialServiceImpl();

		Employee sunil = new Employee("Sunil", "Kumar", "technical");
		
		serviceImpl.generateEmailAddress(sunil);
		String password = serviceImpl.generatePassword();
		sunil.setPassword(password);
		
		serviceImpl.displayCredentials(sunil);
	}
}
