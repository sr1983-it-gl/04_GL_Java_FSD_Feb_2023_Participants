package com.gl.javafsd.bst;

public class IntegerDemo {

	public static void main(String[] args) {
		
		// int -> Integer
		// float -> Float
		// char -> Character
		int a1 = 10;
//		a1.
		acceptIntegerObject(a1);
		
		Integer a1Obj = Integer.valueOf(20);
//		a1Obj.
		acceptIntegerObject(a1Obj);
		
		int a2 = 30;
		acceptIntegerSimpleDataType(a2);
		
		Integer a2Obj = Integer.valueOf(40);
		acceptIntegerSimpleDataType(a2Obj);
	}
	
	static void acceptIntegerObject(Integer intObj) {
		
		System.out.println("Accept Integer Object ->" + intObj);
	}
	
	static void acceptIntegerSimpleDataType(int i) {
		
		System.out.println("Accept Integer Simple Data Type ->" + i);
	}
}
