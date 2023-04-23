package com.gl.javafsd.dsa.balancedbrackets;

public class BalancedBracketPair {

	private char openBracket;
	private char closeBracket;
	
	public BalancedBracketPair(char openBracket, char closeBracket) {
		
		this.openBracket = openBracket;
		this.closeBracket = closeBracket;
	}
	
	public char getOpenBracket() {
		return openBracket;
	}
	public void setOpenBracket(char openBracket) {
		this.openBracket = openBracket;
	}
	public char getCloseBracket() {
		return closeBracket;
	}
	public void setCloseBracket(char closeBracket) {
		this.closeBracket = closeBracket;
	}	
}
