package com.gl.javafsd.dsa.paymoney;

import java.util.Scanner;

public class PayMoneyTransactionManager {

	public PayMoneyTransactionManager() {
		
	}
	
	public void process() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array :");	
		int transactionArraySize = input.nextInt();	
		int[] transactions = new int[transactionArraySize];
		

		System.out.println("Enter the transaction array element(s):");	
		for (int index = 0; index < transactionArraySize; index ++) {

			transactions[index] = input.nextInt();
			input.nextLine();
		}				
		
		System.out.print("Enter the number of transaction (instances) to be achieved:");
		int transactionsInstanceSize = input.nextInt();
		
		input.nextLine();
		
		for (int index = 1; index <= transactionsInstanceSize; index ++) {

			System.out.println();
			System.out.print("Enter the transaction / target value :");
			int dailyTarget = input.nextInt();

			input.nextLine();

			System.out.println("Processing transaction with value -> " + dailyTarget);
			
			TargetDeterminator determinator 
			= new TargetDeterminator(
				transactions, dailyTarget);
			
			Result result = determinator.determine();
			
			System.out.println("Target Achieved -> " + result.isTargetAchievedOrNot());
			System.out.println("No of transactions ->" + result.getNoOfTransactions());					
		}		
	}
}