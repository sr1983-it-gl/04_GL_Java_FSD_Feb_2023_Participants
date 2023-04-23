package com.gl.javafsd.dsa.balancedbrackets;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> numbersStack = new Stack<>();
		
		numbersStack.push(1);
		numbersStack.push(2);
		numbersStack.push(3);
		numbersStack.push(4);
		
		Integer value1 = numbersStack.pop();
		System.out.println(value1);

		Integer value2 = numbersStack.pop();
		System.out.println(value2);

		Integer value3 = numbersStack.pop();
		System.out.println(value3);

		Integer value4 = numbersStack.pop();
		System.out.println(value4);		
	
		if (!numbersStack.isEmpty()) {

			Integer value5 = numbersStack.pop();
			System.out.println(value5);					
		}else {
			System.out.println("Stack is empty...");
		}
	}
}
