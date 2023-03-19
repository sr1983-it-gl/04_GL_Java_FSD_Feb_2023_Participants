package com.greatlearning.javafsd.dsa.arrayrotation.test;

import com.greatlearning.javafsd.dsa.arrayrotation.ArrayRotater;

public class ArrayRotaterTest {

	public static void main(String[] args) {
		
//		testIterationWay1();
//		testIterationWay2();
		
//		testArrayRotationLeftV1();
//		testArrayRotationLeftV2();
		
		testArrayRotationByPosition();
		
	}
	
	static void testIterationWay1() {
		
		int[] array = {7, 2, 14, 21};
		
		ArrayRotater rotater = new ArrayRotater(array);
		rotater.iterationWay1();		
	}
	
	static void testIterationWay2() {
		
		int[] array = {7, 2, 14, 21};
		
		ArrayRotater rotater = new ArrayRotater(array);
		rotater.iterationWay2();		
	}
	
	static void testArrayRotationLeftV1() {
		
//		int[] array = {7, 2, 14, 21};
		
		int[] array = {3, 2, 11, 42, 25};
		
		ArrayRotater rotater = new ArrayRotater(array);
		rotater.rotateLeft();		
	}	

	static void testArrayRotationLeftV2() {
		
//		int[] array = {7, 2, 14, 21};
		
		int[] array = {3, 2, 11, 42, 25};
		
		ArrayRotater rotater = new ArrayRotater(array);
		rotater.rotateLeftV2();		
	}	

	static void testArrayRotationByPosition() {
		
//		int[] array = {7, 2, 14, 21};
		
		int[] array = {3, 2, 11, 42, 25};
		
		ArrayRotater rotater = new ArrayRotater(array);
		rotater.rotateLeft(8);		
	}		
	
}
