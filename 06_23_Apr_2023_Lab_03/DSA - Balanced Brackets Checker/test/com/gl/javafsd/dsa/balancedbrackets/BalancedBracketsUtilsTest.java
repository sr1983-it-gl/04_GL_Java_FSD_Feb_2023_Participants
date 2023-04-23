package com.gl.javafsd.dsa.balancedbrackets;

import java.util.Set;

public class BalancedBracketsUtilsTest {

	public static void main(String[] args) {
		
		BalancedBracketsUtils utils = new BalancedBracketsUtils();
		
		utils.maintainAllValidBalancedBrackets();
		
		Set<Character> allOpenBrackets = utils.getAllOpenBrackets();
		
		System.out.println("Open Brackets ->");
		for (Character openBracket : allOpenBrackets) {
			System.out.println(openBracket);			
		}
		
		
		Set<Character> allClosedBrackets = utils.getAllCloseBrackets();
		System.out.println("Closed Brackets ->");
		for (Character closedBracket : allClosedBrackets) {
			System.out.println(closedBracket);			
		}
	}
	
}
