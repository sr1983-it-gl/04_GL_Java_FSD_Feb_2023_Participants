package com.greatlearning.javafsd.bankingapp.test;

import com.greatlearning.javafsd.bankingapp.Customer;
import com.greatlearning.javafsd.bankingapp.OnlineBankingImpl;

public class OnlineBankingImplTest {

	public static void main(String[] args) {
		
//		depositScenarios();		
//		
//		withdrawalScenarios();
	}
	
	
	static void depositScenarios(){
		
		Customer raghu = new Customer();
		
		System.out.println("Before deposit, balance amount -> " 
			+ raghu.getBalanceAmount());
		
		OnlineBankingImpl indianBank = 
			new OnlineBankingImpl(raghu);
		
		indianBank.deposit(100);
		
		System.out.println("After deposit-1, balance amount -> " 
				+ raghu.getBalanceAmount());		
		
		indianBank.deposit(500);
		
		System.out.println("After deposit-2, balance amount -> " 
				+ raghu.getBalanceAmount());		
	}

	
	static void withdrawalScenarios() {
		
		Customer raghu = new Customer();
				
		OnlineBankingImpl indianBank = 
			new OnlineBankingImpl(raghu);
		
		indianBank.withdraw(250);
		
		indianBank.deposit(700);
		System.out.println("After Deposit, balance amount -> " 
			+ raghu.getBalanceAmount());		
		
		indianBank.withdraw(400);
		System.out.println("After Withdraw, balance amount -> " 
				+ raghu.getBalanceAmount());	
		
		indianBank.withdraw(250);
		System.out.println("After Withdraw, balance amount -> " 
				+ raghu.getBalanceAmount());	

		indianBank.withdraw(50);
		System.out.println("After Withdraw, balance amount -> " 
				+ raghu.getBalanceAmount());		

		indianBank.withdraw(50);
		System.out.println("After Withdraw, balance amount -> " 
				+ raghu.getBalanceAmount());				
	}

}
