package com.greatlearning.javafsd.dsa.arrayrotation.test;

import com.greatlearning.javafsd.dsa.arrayrotation.MidElementFinder;

public class MidElementFinderTest {

	public static void main(String[] args) {
		
		
//		int[] array = {3, 6, 9, 12, 15};
		
		int[] array = {4, 8, 12, 16, 20, 24};
		
		MidElementFinder finder 
			= new MidElementFinder(array);
	
		int value = finder.findMiddleElement();
		
		System.out.println("Mid Element ->" + value);
	}
}
