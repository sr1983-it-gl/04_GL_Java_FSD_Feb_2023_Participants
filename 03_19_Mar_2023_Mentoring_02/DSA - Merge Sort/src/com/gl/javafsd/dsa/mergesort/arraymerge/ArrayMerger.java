package com.gl.javafsd.dsa.mergesort.arraymerge;

public class ArrayMerger {

	int aArray[];
	int bArray[];
	
	int cArray[];
	
	public ArrayMerger(int aArray[], int bArray[]) {
	
		this.aArray = aArray;
		this.bArray = bArray;
		
		int cArrayLength = aArray.length + bArray.length;
		this.cArray = new int[cArrayLength];
	}
	
	public int[] merge() {
	
		int aPointer = 0;
		int bPointer = 0;
		
		int cPointer = 0;
		
		// 0 0 0
		// 0 1 1
		// 1 1 2
		// 1 2 3
		while (aPointer < aArray.length &&
				bPointer < bArray.length) {
			
			// 1 < 4 && 2 < 2
			
			int aArrayElement = aArray[aPointer];
			int bArrayElement = bArray[bPointer];
			
			if (aArrayElement < bArrayElement) {
				
				cArray[cPointer] = aArrayElement;
				aPointer ++;
				cPointer ++;
			}else {
				
				cArray[cPointer] = bArrayElement;
				bPointer ++;
				cPointer ++;
			}			
		}
		
		// 1 2
		
		// Copy remaining elements from aArray
		// int aPointer = 1
		for (; aPointer < aArray.length; aPointer ++) {
		
			int aArrayElement = aArray[aPointer];
			cArray[cPointer] = aArrayElement;
			cPointer ++;
		}
		
		// Copy remainign elements from bArray
		for (; bPointer < bArray.length; bPointer ++) {
			
			int bArrayElement = bArray[bPointer];
			cArray[cPointer] = bArrayElement;
			cPointer ++;
		}	
		
		return cArray;
	}
}
