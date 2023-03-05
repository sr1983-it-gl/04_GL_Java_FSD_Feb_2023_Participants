package com.greatlearning.javafsd.bankingapp;

public class OnlineBankingImpl
	implements OnlineBanking{

	Customer customer;
	
	public OnlineBankingImpl(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public void deposit(float amount) {

		// 1000
		// 1000 + 100 = 1100
		double balanceAmount 
			= customer.getBalanceAmount();
		
		double tempAmount = 
			balanceAmount + amount;
		
		customer.setBalanceAmount(tempAmount);		
	}

	@Override
	public void withdraw(float withdrawalAmount) {
		// TODO Auto-generated method stub
	
		// Scenario-1
			// 1000
			// 300
			// Balance = 700
		// Scenario-2
			// 1000
			// 1500
			// Balance = (-500)
		
		double balanceAmount = customer.getBalanceAmount();
		if (withdrawalAmount > balanceAmount) {
			
			// Dont Allow this operation
			System.out.println("Insufficient Funds. Withdrawal failed");
		}else {
			double tempAmount = balanceAmount - withdrawalAmount;
			customer.setBalanceAmount(tempAmount);
		}
	}

	
	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void transfer(float amount, String accountNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

}
