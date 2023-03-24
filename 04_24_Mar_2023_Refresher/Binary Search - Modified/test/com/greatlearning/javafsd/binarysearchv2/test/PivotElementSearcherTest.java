package com.greatlearning.javafsd.binarysearchv2.test;

import com.greatlearning.javafsd.binarysearchv2.PivotElementSearcher;

public class PivotElementSearcherTest {

	public static void main(String[] args) {
		
//		test1();
//		test2Linear();
//		test3Binary();
//		test4Binary();
//		test5Binary();
		test6Binary();
	}
	
	static void test1Linear() {
		
		int[] array = {27, 36, 39, 45, 9, 18, 23};
		
		PivotElementSearcher pivotSearcher 
			= new PivotElementSearcher(array);
		
		int pivotIndex = pivotSearcher.searchLinear();
		System.out.println("Pivot Index value ->" + pivotIndex);		
	}
	
	static void test2Linear() {
		
		int[] array = {30, 40, 60, 80, 100, 2};
		
		PivotElementSearcher pivotSearcher 
			= new PivotElementSearcher(array);
		
		int pivotIndex = pivotSearcher.searchLinear();
		System.out.println("Pivot Index value ->" + pivotIndex);		
	}	

	static void test3Binary() {
		
		int[] array = {30, 40, 60, 80, 100, 2};
		
		PivotElementSearcher pivotSearcher 
			= new PivotElementSearcher(array);
		
		int pivotIndex = pivotSearcher.searchBinary();
		System.out.println("Pivot Index value ->" + pivotIndex);		
	}	

	static void test4Binary() {
		
		int[] array = {27, 36, 39, 45, 9, 18, 23};
		
		PivotElementSearcher pivotSearcher 
			= new PivotElementSearcher(array);
		
		int pivotIndex = pivotSearcher.searchBinary();
		System.out.println("Pivot Index value ->" + pivotIndex);		
	}	

	static void test5Binary() {
		
		int[] array = {23, 27, 36, 39, 45, 9, 18};
		
		PivotElementSearcher pivotSearcher 
			= new PivotElementSearcher(array);
		
		int pivotIndex = pivotSearcher.searchBinary();
		System.out.println("Pivot Index value ->" + pivotIndex);		
	}	

	static void test6Binary() {
		
		int[] array = {39, 45, 9, 18, 23, 27, 36};
		
		PivotElementSearcher pivotSearcher 
			= new PivotElementSearcher(array);
		
		int pivotIndex = pivotSearcher.searchBinary();
		System.out.println("Pivot Index value ->" + pivotIndex);		
	}	
	
}
