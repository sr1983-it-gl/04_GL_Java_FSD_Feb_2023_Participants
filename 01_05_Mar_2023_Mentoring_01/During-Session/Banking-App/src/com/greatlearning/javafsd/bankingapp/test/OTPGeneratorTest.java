package com.greatlearning.javafsd.bankingapp.test;

import com.greatlearning.javafsd.bankingapp.OTPGenerator;

public class OTPGeneratorTest {

	public static void main(String[] args) {
		
		OTPGenerator generator = new OTPGenerator();
	
		int otp = generator.generate2();
	
//		System.out.println(otp);
	}
	
}
