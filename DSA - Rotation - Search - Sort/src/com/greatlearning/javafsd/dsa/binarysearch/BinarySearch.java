package com.greatlearning.javafsd.dsa.binarysearch;

import com.greatlearning.javafsd.dsa.arrayrotation.MidElementFinder;

public class BinarySearch {

	int[] array;
	int searchValue;
	
	public BinarySearch(int[] array, int searchValue) {
	
		this.array = array;
		this.searchValue = searchValue;
	}
	
	public void search() {
		
		int startIndex = 0;
		int endIndex = array.length - 1;
		
		while (startIndex <= endIndex) {

			System.out.println("[" + startIndex + "], [" + endIndex + "]");
			
			int middleElementIndex = 
					(startIndex + endIndex) / 2;
			int middleElementValue = array[middleElementIndex];
						
			if (searchValue == middleElementValue) {
				
				System.out.println("Identified the search value");
				System.out.println("Index is " + middleElementIndex);
				return;
			}else {
				
				if (searchValue > middleElementValue) {
					
					// Element can be present on the right side
					startIndex = middleElementIndex + 1;
				}else {
					
					// SearchValue < MiddleElementValue
					// element can be prsent on the left side
					endIndex = middleElementIndex;
				}
			}
		}
		
		System.out.println("Search value " + searchValue + " is not present");
	}
}
