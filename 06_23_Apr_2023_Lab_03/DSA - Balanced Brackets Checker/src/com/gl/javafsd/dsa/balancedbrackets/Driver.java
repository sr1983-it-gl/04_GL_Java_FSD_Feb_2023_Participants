package com.gl.javafsd.dsa.balancedbrackets;

public class Driver {

	public static void main(String[] args) {
		
		String expression = "([[{}]))";
		BalancedBracketsChecker checker = 
			new BalancedBracketsChecker(expression);
		
		boolean result = checker.check();
		if (result) {
			System.out.printf("Expression %s is balanced", expression);
		}else {
			System.out.printf("Expression %s is NOT balanced", expression);
		}
		
	}
}
