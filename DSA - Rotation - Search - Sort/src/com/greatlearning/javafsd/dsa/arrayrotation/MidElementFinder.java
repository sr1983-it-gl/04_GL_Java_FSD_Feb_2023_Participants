package com.greatlearning.javafsd.dsa.arrayrotation;

public class MidElementFinder {

	int[] array;
	
	public MidElementFinder(int[] array) {
		
		this.array = array;
	}
	
	public int findMiddleElement() {
		
		int length = array.length;
		
		int middleElementIndex = length / 2;
	
		int middleElementValue = array[middleElementIndex];
		
		return middleElementValue;
	}
	
//	public int findMiddleElementIndex() {
//		
//		
//	}
}
