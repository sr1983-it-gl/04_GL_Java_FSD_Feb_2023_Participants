package com.gl.javafsd.dsa.mergesort;

import com.gl.javafsd.dsa.mergesort.arraymerge.Util;

public class MergeSortNonRecursiveApproachTest {

	public static void main(String[] args) {
		
		Util util = new Util();
		
		int array[] = {8, 2, 6, 4,5, 3, 7, 1};
		util.printArray(array);
		
		MergeSortNonRecursiveApproach mergeSort = 
			new MergeSortNonRecursiveApproach(array);
		
//		mergeSort.step1LeftIndexCalculate();
		
//		mergeSort.step2Batch1RightIndexCalculate();
		
//		mergeSort.step3Batch2LeftRightIndexCalculate();
		
//		mergeSort.step4Batch3LeftRightIndexCalculate();
		
//		mergeSort.step5AddGenericLoop();
		
//		mergeSort.step6GeneralizeBatchCount();
		
//		mergeSort.step7CalculateMiddleIndex();
		
		mergeSort.step8FinalStep();
		
		util.printArray(array);
	}
}
