package com.gl.javafsd.dsa.mergesort.arraymerge;

public class ArrayMergerTest {

	public static void main(String[] args) {
		
//		testData1();
//		testData2();
		testData3();
	}
	
	static void testData1() {

		Util util = new Util();
		
		int aArray[] = {2, 7};
		util.printArray(aArray);
		
		int bArray[] = {4, 8};
		util.printArray(bArray);
		
		ArrayMerger merger = new ArrayMerger(aArray, bArray);
		
		int cArray[] = merger.merge();
		util.printArray(cArray);				
	}
	
	static void testData2() {

		Util util = new Util();
		
		int aArray[] = {4, 13, 21, 24};
		util.printArray(aArray);
		
		int bArray[] = {1, 8};
		util.printArray(bArray);
		
		ArrayMerger merger = new ArrayMerger(aArray, bArray);
		
		int cArray[] = merger.merge();
		util.printArray(cArray);				
	}	

	static void testData3() {

		Util util = new Util();
		
		int aArray[] = {6, 12};
		util.printArray(aArray);
		
		int bArray[] = {4, 7, 16, 21};
		util.printArray(bArray);
		
		ArrayMerger merger = new ArrayMerger(aArray, bArray);
		
		int cArray[] = merger.merge();
		util.printArray(cArray);				
	}	

}
