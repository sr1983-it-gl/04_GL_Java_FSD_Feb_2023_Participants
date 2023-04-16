package com.gl.javafsd.dsa.lca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(5);
		numbers.add(40);
		numbers.add(30);
		
		Iterator<Integer> it = numbers.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}

		for (int index = 0; index < numbers.size(); index ++) {
			
			int element = numbers.get(index);
			System.out.println(element);
		}
	}
}
