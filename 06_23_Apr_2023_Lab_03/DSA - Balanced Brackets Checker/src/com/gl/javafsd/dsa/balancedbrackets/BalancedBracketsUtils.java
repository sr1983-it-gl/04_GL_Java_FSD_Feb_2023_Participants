package com.gl.javafsd.dsa.balancedbrackets;

import java.util.HashSet;
import java.util.Set;

public class BalancedBracketsUtils {

	private Set<BalancedBracketPair> balancedBracketsSet
		= new HashSet<>();
	
	public void maintainAllValidBalancedBrackets() {
		
		BalancedBracketPair pair1 = 
				new BalancedBracketPair('[', ']');
		balancedBracketsSet.add(pair1);

		BalancedBracketPair pair2 = 
				new BalancedBracketPair('{', '}');		
		balancedBracketsSet.add(pair2);

		BalancedBracketPair pair3 = 
				new BalancedBracketPair('(', ')');		
		balancedBracketsSet.add(pair3);		
	}
	
	public Set<Character> getAllOpenBrackets() {
		
		Set<Character> allOpenBrackets = new HashSet<>();
		
		for (BalancedBracketPair pair : balancedBracketsSet) {
			
			char openBracketChar = pair.getOpenBracket();			
			allOpenBrackets.add(openBracketChar);
		}
		return allOpenBrackets;
	}
	
	public Set<Character> getAllCloseBrackets() {
		
		Set<Character> closeBrackets = new HashSet<>();
		
		for (BalancedBracketPair pair : balancedBracketsSet) {
			
			char closedBracketChar = pair.getCloseBracket();
			closeBrackets.add(closedBracketChar);
		}
		
		return closeBrackets;
	}
	
	public Character getOpenBracket(Character closedBracket) {
		
		for (BalancedBracketPair pair : balancedBracketsSet) {
			
			Character closedBracketFromPair 
				= pair.getCloseBracket();
			if (closedBracket.equals(closedBracketFromPair)) {
				
				return pair.getOpenBracket();
			}
		}
		return null;
	}
}
