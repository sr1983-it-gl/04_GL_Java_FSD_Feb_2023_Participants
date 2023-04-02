package com.gl.javafsd.dsa.denominations;

public class DenominationInstancesPair {

	private int denominationValue;
	private int noOfInstances;
	
	public DenominationInstancesPair(
		int denominationValue, int noOfInstances) {
		
		this.denominationValue = denominationValue;
		this.noOfInstances = noOfInstances;
	}
	
	public int getDenominationValue() {
		return denominationValue;
	}
	public void setDenominationValue(int denominationValue) {
		this.denominationValue = denominationValue;
	}
	public int getNoOfInstances() {
		return noOfInstances;
	}
	public void setNoOfInstances(int noOfInstances) {
		this.noOfInstances = noOfInstances;
	}	
}
