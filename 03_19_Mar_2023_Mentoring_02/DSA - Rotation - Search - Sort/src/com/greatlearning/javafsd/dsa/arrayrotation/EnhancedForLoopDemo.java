package com.greatlearning.javafsd.dsa.arrayrotation;

public class EnhancedForLoopDemo {

	
	void loop() {
		
		int[] array = {1, 2, 3};
		
		int index = 0;
		for (int item : array) {
			
			System.out.println(item);
		
			index ++;
		}
	}

	public static void main(String[] args) {
		
		EnhancedForLoopDemo demo = new EnhancedForLoopDemo();
		
		demo.loop();
	}
}
