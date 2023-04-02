package com.gl.javafsd.dsa.paymoney;

public class TargetDeterminator {

	private int[] noOfTransactionsCountArray;
	private int dailyTarget;
	
	Result result;
	
	public TargetDeterminator(
		int[] noOfTransactionsCountArray,
		int dailyTarget) {
		
		this.noOfTransactionsCountArray = noOfTransactionsCountArray;
		this.dailyTarget = dailyTarget;
		
		result = new Result();
	}
	
	public Result determine(){
		
		// iterate over the array
		// for each iteration, compute the intermediate value
		// check the intermediate value with the daily-transaction 
		// 
		
		int tempValue = 0;
	
		for (int index = 0; index < noOfTransactionsCountArray.length; index ++) {
			
			int noOfTransactions = noOfTransactionsCountArray[index];
		
			// 0 [25], 1 [35], 2 [115]
			tempValue = tempValue + noOfTransactions;
			
			if (tempValue >= dailyTarget) {
				
				result.setNoOfTransactions((index + 1));
				result.setTargetAchievedOrNot(true);
				
				break;
			}
		}
		
		if (!result.isTargetAchievedOrNot()) {
			result.setNoOfTransactions(-1);
		}
		
		return result;
	}
}
