package com.gl.javafsd.dsa.paymoney;

public class TargetDeterminatorTestV2 {

	public static void main(String[] args) {
				
		genericScenario(new int[]{20, 12, 31}, 21);			
		genericScenario(new int[] {20, 12, 31}, 19);						
		genericScenario(new int[] {100}, 101);				
		genericScenario(new int[] {25, 35, 55}, 115);		
		genericScenario(new int[] {25, 35, 55}, 116);		
		genericScenario(new int[] {25, 22, 40, 13}, 100);		
	}
	
	static void genericScenario(
		int transactionsArray[],
		int dailyTarget ) {
				
		TargetDeterminator determinator 
			= new TargetDeterminator(transactionsArray, dailyTarget);
		
		Result result = determinator.determine();
		
		System.out.println("Target Achieved -> " + result.isTargetAchievedOrNot());
		System.out.println("No of transactions ->" + result.getNoOfTransactions());		
	}
	
}
