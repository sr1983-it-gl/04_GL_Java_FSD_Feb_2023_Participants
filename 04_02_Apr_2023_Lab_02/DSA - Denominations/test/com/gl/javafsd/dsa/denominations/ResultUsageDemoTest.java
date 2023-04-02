package com.gl.javafsd.dsa.denominations;

import java.util.ArrayList;
import java.util.List;

public class ResultUsageDemoTest {

	public static void main(String[] args) {
		
		Result r1 = new Result();
		
		r1.setExactPaymentAchievedOrNot(true);
		
		DenominationInstancesPair diPair1
			= new DenominationInstancesPair(123, 1);
		DenominationInstancesPair diPair2
			= new DenominationInstancesPair(18, 1);
		DenominationInstancesPair diPair3
			= new DenominationInstancesPair(12, 1);
		DenominationInstancesPair diPair4
			= new DenominationInstancesPair(5, 1);
		
		List<DenominationInstancesPair> list = new 
			ArrayList<>();
		
		list.add(diPair1);
		list.add(diPair2);
		list.add(diPair3);
		list.add(diPair4);
		
		r1.setDenominationInstancesList(list);	
		
		System.out.println();
	}
}
