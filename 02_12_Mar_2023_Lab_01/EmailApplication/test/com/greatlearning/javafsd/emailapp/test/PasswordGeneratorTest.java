package com.greatlearning.javafsd.emailapp.test;

import com.greatlearning.javafsd.emailapp.service.PasswordGenerator;

public class PasswordGeneratorTest {

	public static void main(String[] args) {
		
		
		PasswordGenerator generator = new PasswordGenerator();
		
		String password = generator.generate();
	
		System.out.println("Generated password ->" + password);
	}
}
