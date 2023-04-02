package com.gl.javafsd.dsa.denominations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		
		int[] denominations = new int[size];
		System.out.println("Enter the denomination value");
		for (int i = 0; i < size; i++) {
			denominations[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		DenominationsCalculator calculator = 
				new DenominationsCalculator(denominations, amount);
					
		Result result = calculator.calculate();
		
		boolean exactPaymentAchieved = result.isExactPaymentAchievedOrNot();
		if (exactPaymentAchieved) {
		
			System.out.println("Exact Payment is Achieved");
			
			List<DenominationInstancesPair> list 
				= result.getDenominationInstancesList();
		
			for (DenominationInstancesPair pair : list) {
				
				int denominationValue = pair.getDenominationValue();
				int noOfInstances = pair.getNoOfInstances();
				
				System.out.println("Denomination Value is " 
					+ denominationValue + ", Number of Instances " 
						+ noOfInstances );
			}
		}else {
			System.out.println("Exact payment cannot be achieved...");
		}				
	}
	
}
