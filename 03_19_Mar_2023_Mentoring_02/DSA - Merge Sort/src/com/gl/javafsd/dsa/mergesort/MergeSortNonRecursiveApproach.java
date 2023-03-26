package com.gl.javafsd.dsa.mergesort;

import com.gl.javafsd.dsa.mergesort.arraymerge.IndexBasedArrayMerger;

public class MergeSortNonRecursiveApproach {

	int[] array;
	
	public MergeSortNonRecursiveApproach(int[] array) {
	
		this.array = array;
	}
	
	public void step1Batch1LeftIndexCalculate() {
		
		int size = array.length;
		
		for (int leftIndex = 0; leftIndex < size; 
				leftIndex = leftIndex + 2 ) {
			
			System.out.println(leftIndex);
		}
	}

	public void step2Batch1RightIndexCalculate() {
		
		int size = array.length;
		
		int countOfElements = 2;
		for (int leftIndex = 0; leftIndex < size; 
				leftIndex = leftIndex + 2 ) {
			
			int rightIndex = (leftIndex + countOfElements) - 1;
			System.out.println(leftIndex + ", " + rightIndex);
		}
	}

	public void step3Batch2LeftRightIndexCalculate() {
		
		int size = array.length;
		
		// Batch 1
		System.out.println("---------------");
		int countOfElements = 2;
		for (int leftIndex = 0; leftIndex < size; 
				leftIndex = leftIndex + countOfElements ) {
			
			int rightIndex = (leftIndex + countOfElements) - 1;
			System.out.println(leftIndex + ", " + rightIndex);
		}

		// Batch 2
		System.out.println("---------------");		
		countOfElements = 4;
		for (int leftIndex = 0; leftIndex < size; 
				leftIndex = leftIndex + countOfElements ) {
			
			int rightIndex = (leftIndex + countOfElements) - 1;
			System.out.println(leftIndex + ", " + rightIndex);
		}		
	}
	
	
	public void step4Batch3LeftRightIndexCalculate() {
		
		int size = array.length;
		
		// Batch 1
		System.out.println("---------------");
		int countOfElements = 2;
		for (int leftIndex = 0; leftIndex < size; 
				leftIndex = leftIndex + countOfElements ) {
			
			int rightIndex = (leftIndex + countOfElements) - 1;
			System.out.println(leftIndex + ", " + rightIndex);
		}

		// Batch 2
		System.out.println("---------------");		
		countOfElements = 2 * 2;
		for (int leftIndex = 0; leftIndex < size; 
				leftIndex = leftIndex + countOfElements ) {
			
			int rightIndex = (leftIndex + countOfElements) - 1;
			System.out.println(leftIndex + ", " + rightIndex);
		}		

		// Batch 3
		System.out.println("---------------");		
		countOfElements = 4 * 2;
		for (int leftIndex = 0; leftIndex < size; 
				leftIndex = leftIndex + countOfElements ) {
			
			int rightIndex = (leftIndex + countOfElements) - 1;
			System.out.println(leftIndex + ", " + rightIndex);
		}		
	}	
	
	
	public void step5AddGenericLoop() {
		
		int size = array.length;
		
		int countOfElements = 1;
		
		for (int batchIndex = 0; batchIndex < 3; batchIndex ++) {
			
			// Batch 1
			System.out.println("---------------");
			countOfElements = countOfElements * 2;
			// 2, 4, 8
			for (int leftIndex = 0; leftIndex < size; 
					leftIndex = leftIndex + countOfElements ) {
				
				int rightIndex = (leftIndex + countOfElements) - 1;
				System.out.println(leftIndex + ", " + rightIndex);
			}
			
		}	
	}		

	
	public void step6GeneralizeBatchCount() {
		
		int size = array.length;
		
		int countOfElements = 1;
		
		// 0 [ 1 * 2] 2
		// 2 [ 3 * 2] 6
		//
		for (int batchIndex = 0; batchIndex < size; 
				batchIndex = (batchIndex + 1) * 2) {
			
			// Batch 1
			System.out.println("Batch Index ---------------" + batchIndex);
			countOfElements = countOfElements * 2;
			// 2, 4, 8
			for (int leftIndex = 0; leftIndex < size; 
					leftIndex = leftIndex + countOfElements ) {
				
				int rightIndex = (leftIndex + countOfElements) - 1;
				System.out.println(leftIndex + ", " + rightIndex);
			}
			
		}	
	}		
	
	
	public void step7CalculateMiddleIndex() {
		
		int size = array.length;
		
		int countOfElements = 1;
		
		// 0 [ 1 * 2] 2
		// 2 [ 3 * 2] 6
		//
		for (int batchIndex = 0; batchIndex < size; 
				batchIndex = (batchIndex + 1) * 2) {
			
			// Batch 1
			System.out.println("Batch Index ---------------" + batchIndex);
			countOfElements = countOfElements * 2;
			// 2, 4, 8
			for (int leftIndex = 0; leftIndex < size; 
					leftIndex = leftIndex + countOfElements ) {
				
				int rightIndex = (leftIndex + countOfElements) - 1;
				
				int midPointIndex = (leftIndex + rightIndex) /2;
				
				System.out.println(leftIndex + ", " 
						+ rightIndex + ", " + midPointIndex);
			}
			
		}	
	}		
		
	public void step8FinalStep() {
		
		int size = array.length;
		
		int countOfElements = 1;
		
		// 0 [ 1 * 2] 2
		// 2 [ 3 * 2] 6
		//
		for (int batchIndex = 0; batchIndex < size; 
				batchIndex = (batchIndex + 1) * 2) {
			
			// Batch 1
			System.out.println("Batch Index ---------------" + batchIndex);
			countOfElements = countOfElements * 2;
			// 2, 4, 8
			for (int leftIndex = 0; leftIndex < size; 
					leftIndex = leftIndex + countOfElements ) {
				
				int rightIndex = (leftIndex + countOfElements) - 1;
				
				int midPointIndex = (leftIndex + rightIndex) /2;
				
				System.out.println(leftIndex + ", " 
						+ rightIndex + ", " + midPointIndex);
				
				IndexBasedArrayMerger merger = 
					new IndexBasedArrayMerger(array);
				merger.merge(leftIndex, midPointIndex, rightIndex);
			}
			
		}	
	}			
}
