package com.greatlearning.javafsd.emailapp.test;

import com.greatlearning.javafsd.emailapp.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapp.Employee;

public class CredentialServiceImplTest {

	public static void main(String[] args) {
		
		CredentialServiceImpl serviceImpl = 
			new CredentialServiceImpl();
		
		Employee sunil = new Employee("Sunil", "Kumar", "technical");
		
		String emailAddress 
			= serviceImpl.generateEmailAddress(sunil);
		
		System.out.println(emailAddress);
	}
}
