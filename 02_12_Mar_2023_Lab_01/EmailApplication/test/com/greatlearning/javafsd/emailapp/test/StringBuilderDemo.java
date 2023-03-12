package com.greatlearning.javafsd.emailapp.test;

public class StringBuilderDemo {

	public static void main(String[] args) {

//		stringBuilderDemo();
		stringDemo();
	}
	
	static void stringBuilderDemo() {
		StringBuilder test = new StringBuilder();
		
		test.append("hello");
		test.append(" ");
		test.append("good ");
		test.append("morning");
		
		String finalStr = test.toString();
		System.out.println(finalStr);
		
	}
	
	static void stringDemo() {
		
		String test = new String();
		
		test = test + "hello";
		test = test + " ";
		test = test + "good ";
		test = test + "morning";
		
		System.out.println(test);
	}
}
