package com.greatlearning.javafsd.bankingapp;

import java.util.Random;

public class OTPGenerator {
	
	// 1783, 4343, 9882, 4398
	public int generate(){
		
		// 0.434343233, 0.3283289372, 0.0343704372
		// 0.0023434, 
		double randomValue = Math.random();		
		
	
//		System.out.println("Random Value " + randomValue);
		
		// 4343.43233
		// 0.00000001
		double temp1 = (randomValue * 9000) + 1000;
//			System.out.println("Temp 1 " + temp1);
		
		int otp = (int)temp1;
//			System.out.println("Temp2 " + temp2);
				
//		return 0;
		return otp;
	}
	
	public int generate2() {
				
		Random randomObj = new Random();
		int randomValue = randomObj.nextInt(1000, 9999);
		
		System.out.println(randomValue);
		return randomValue;
	}

}
