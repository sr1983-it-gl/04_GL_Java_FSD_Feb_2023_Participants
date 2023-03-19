package com.greatlearning.javafsd.dsa.arrayrotation;

public class ArrayRotater {

//	int aArray[];
//	int[] bArray;
//	
//	int a;
//	int b;
//	
//	int c, d;
	
	int[] array;
	
	public ArrayRotater(int[] array) {
		
		this.array = array;
	}

	// rotate(2), rotate(2)
	public void rotateLeft(int positionCount) {
		
		// 5
		int length = array.length;
		
		// 15 % 5 -> 0 
		int outcome = positionCount % length;
		if (outcome == 0) {
			return;
		}
		
		// 8 -> 3
		// 14 -> 4
		// 17 -> 2
		for (int counter = 0; counter < positionCount; counter ++) {
			rotateLeft();	
		}
	}
	
	public void rotateLeft() {
		
		int lastIndex = array.length - 1;
		
		// 0, 1, 2, 3 [0 TILL 3]
		
		System.out.println();
		System.out.println("Initial Array ->");
		for (int index = 0; index <= lastIndex; index ++) {
			int value = array[index];
			System.out.print(value + " ");
		}
		
		// Special handling for zeroth element
		int zerothElement = array[0];

		for (int index = 1; index <= lastIndex; index ++) {
			
			int value = array[index];

			int targetIndex = index - 1;
			// Move the element to the targetIndex value
			array[targetIndex] = value;
		}
			
		// Special Handling for zeroth element
		array[lastIndex] = zerothElement;

		System.out.println();
		System.out.println("Left Rotated Array -> ");
		for (int index = 0; index <= lastIndex; index ++) {
			int value = array[index];
			System.out.print(value + " ");
		}
	}
	
	
	public void rotateLeftV2() {
		
		int lastIndex = array.length - 1;
		
		// 0, 1, 2, 3 [0 TILL 3]
		
		System.out.println("Initial Array ->");
		for (int index = 0; index <= lastIndex; index ++) {
			int value = array[index];
			System.out.print(value + " ");
		}
		
		int lastElement = array[lastIndex];

		for (int index = 0; index <= lastIndex; index ++) {
			
			int value = array[index];

			int targetIndex;
			if (index == 0) {
				
				targetIndex = lastIndex;
				
				// Move the element to the targetIndex value
				array[targetIndex] = value;
				
			}else {
				
				targetIndex = index - 1;
				// If the index is the last index
				
				if (index == lastIndex) {
					
					// Take the lastElement value and move it
					// to the previous index
					
					array[targetIndex] = lastElement;
				}else {

					targetIndex = index - 1;	
					// Move the element to the targetIndex value
					array[targetIndex] = value;					
				}				
			}
			
		}
			
		System.out.println();
		System.out.println("Left Rotated Array -> ");
		for (int index = 0; index <= lastIndex; index ++) {
			int value = array[index];
			System.out.print(value + " ");
		}
	}
	
	public void iterationWay1() {
		
		int lastPosition = array.length - 1;
		
		// 0, 1, 2, 3 [0 TILL 3]
		
		for (int index = 0; index <= lastPosition; index ++) {
			
			int value = array[index];
			System.out.println(value);
		}		
	}


	public void iterationWay2() {
		
		// 4
		int arrayLength = array.length;
		
		// < 4
		// 0, 1, 2, 3 [0, 1, 2, 3]
		
		for (int index = 0; index < arrayLength; index ++) {
			
			int value = array[index];
			System.out.println(value);
		}		
	}
	
	public void iterateThroughWhileLoop1() {
		
	}
}
