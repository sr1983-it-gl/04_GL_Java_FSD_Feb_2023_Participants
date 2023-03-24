package com.greatlearning.javafsd.binarysearchv2;

public class PivotElementSearcher {

	int[] array;
	
	public PivotElementSearcher(int[] array) {
	
		this.array = array;
	}
	
	public int searchLinear() {
		
		int pivotIndex = -1;
		
		if (array.length == 1) {
			return pivotIndex;
		}
		
		int firstElement = array[0];
		int lastElement = array[array.length - 1];
		
		if (firstElement < lastElement) {
			
			// Array has not undergone rotation
			return pivotIndex;
		}
		
		
		for (int index = 0; index < (array.length -1); index ++) {
			
			int currentElementValue = array[index];
			int nextElementValue = array[index + 1];
			
			// 9 < 45
			if (nextElementValue < currentElementValue) {
				pivotIndex = index + 1;
				break;
			}
		}
		return pivotIndex;
	}
	
	public int searchBinary() {
				
		int pivotIndex = -1;
		
		if (array.length == 1) {
			return pivotIndex;
		}
		
		int firstElement = array[0];
		int lastElement = array[array.length - 1];
		
		if (firstElement < lastElement) {
			
			// Array has not undergone rotation
			return pivotIndex;
		}
		
		int startIndex = 0;
		int endIndex = (array.length - 1);
		while (startIndex <= endIndex) {
		
			int middleElementIndex = (startIndex + endIndex) / 2;

			System.out.println("---");

			System.out.println(
					String.format("Start %d, End %d, Middle %d", 
							startIndex, endIndex, middleElementIndex));

			int middleElementValue = array[middleElementIndex];
			int nextElementValue = array[middleElementIndex + 1];
			
			
			// 9 < 45
			if (nextElementValue < middleElementValue) {
				// Midpoint evaluation
				
				System.out.println(
					String.format("Next Element Value %d, Middle Element Value %d", 
							nextElementValue, middleElementValue));
				System.out.println("Pivot identified through midpoint index");
				System.out.println("---");
				
				return (middleElementIndex + 1);
			}else if (array[startIndex] <= middleElementValue) {

				// Left array is sorted, i.e., pivot present 
				// on Right side array

				System.out.println(
					String.format("Begin Value %d, Middle Element Value %d", 
							array[startIndex], middleElementValue));
				
				System.out.println("Pivot present on right side array");
				System.out.println("---");
				startIndex = middleElementIndex + 1;
			}else {
				
				// Right array is sorted, that means, pivot is present 
				// on Left side array 
				

				System.out.println("Pivot present on left side array");
				System.out.println("---");
				endIndex = middleElementIndex - 1;
			}
			// check
		}
		return 0;
	}
}
