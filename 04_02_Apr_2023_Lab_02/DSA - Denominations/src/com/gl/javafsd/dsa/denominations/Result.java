package com.gl.javafsd.dsa.denominations;

import java.util.ArrayList;
import java.util.List;

public class Result {

	private boolean exactPaymentAchievedOrNot;
	private List<DenominationInstancesPair> denominationInstancesList;
	
	public Result() {
		denominationInstancesList = new ArrayList<>();
	}
	
	public boolean isExactPaymentAchievedOrNot() {
		return exactPaymentAchievedOrNot;
	}
	public void setExactPaymentAchievedOrNot(boolean exactPaymentAchievedOrNot) {
		this.exactPaymentAchievedOrNot = exactPaymentAchievedOrNot;
	}
	public List<DenominationInstancesPair> getDenominationInstancesList() {
		return denominationInstancesList;
	}
	public void setDenominationInstancesList(List<DenominationInstancesPair> denominationInstancesList) {
		this.denominationInstancesList = denominationInstancesList;
	}	
}
