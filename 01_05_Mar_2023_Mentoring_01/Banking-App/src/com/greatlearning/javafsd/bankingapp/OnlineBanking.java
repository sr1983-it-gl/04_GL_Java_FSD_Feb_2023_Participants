package com.greatlearning.javafsd.bankingapp;

public interface OnlineBanking {

	void deposit(float amount);

	double checkBalance();
	
	void transfer(float amount, String accountNo);
	
	void withdraw(float amount);
	
	void logout();
	
}
