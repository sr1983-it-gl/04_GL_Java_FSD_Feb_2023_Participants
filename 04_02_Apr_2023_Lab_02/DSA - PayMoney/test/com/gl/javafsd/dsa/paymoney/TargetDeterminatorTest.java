package com.gl.javafsd.dsa.paymoney;

public class TargetDeterminatorTest {

	public static void main(String[] args) {
		
//		scenario1();
//		scenario2();
//		scenario3();
//		scenario4();
		scenario5();
	}

	static void scenario1() {
		
		int transactionsArray[] = {20, 12, 31};
		int dailyTarget = 21;
		
		TargetDeterminator determinator 
			= new TargetDeterminator(transactionsArray, dailyTarget);
		
		Result result = determinator.determine();
		
		System.out.println("Target Achieved -> " + result.isTargetAchievedOrNot());
		System.out.println("No of transactions ->" + result.getNoOfTransactions());		
	}

	static void scenario2() {
		
		int transactionsArray[] = {20, 12, 31};
		int dailyTarget = 19;
		
		TargetDeterminator determinator 
			= new TargetDeterminator(transactionsArray, dailyTarget);
		
		Result result = determinator.determine();
		
		System.out.println("Target Achieved -> " + result.isTargetAchievedOrNot());
		System.out.println("No of transactions ->" + result.getNoOfTransactions());		
	}

	static void scenario3() {
		
		int transactionsArray[] = {100};
		int dailyTarget = 101;
		
		TargetDeterminator determinator 
			= new TargetDeterminator(transactionsArray, dailyTarget);
		
		Result result = determinator.determine();
		
		System.out.println("Target Achieved -> " + result.isTargetAchievedOrNot());
		System.out.println("No of transactions ->" + result.getNoOfTransactions());		
	}

	static void scenario4() {
		
		int transactionsArray[] = {25, 35, 55};
		int dailyTarget = 115;
		
		TargetDeterminator determinator 
			= new TargetDeterminator(transactionsArray, dailyTarget);
		
		Result result = determinator.determine();
		
		System.out.println("Target Achieved -> " + result.isTargetAchievedOrNot());
		System.out.println("No of transactions ->" + result.getNoOfTransactions());		
	}

	static void scenario5() {
		
		int transactionsArray[] = {25, 35, 55};
		int dailyTarget = (115 + 1);
		
		TargetDeterminator determinator 
			= new TargetDeterminator(transactionsArray, dailyTarget);
		
		Result result = determinator.determine();
		
		System.out.println("Target Achieved -> " + result.isTargetAchievedOrNot());
		System.out.println("No of transactions ->" + result.getNoOfTransactions());		
	}
	
}
