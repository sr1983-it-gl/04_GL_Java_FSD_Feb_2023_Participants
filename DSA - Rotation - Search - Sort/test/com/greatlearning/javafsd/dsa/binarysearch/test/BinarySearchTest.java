package com.greatlearning.javafsd.dsa.binarysearch.test;

import com.greatlearning.javafsd.dsa.binarysearch.BinarySearch;

public class BinarySearchTest {

	public static void main(String[] args) {
		
		
		int[] array = {1, 3, 5, 8, 11, 17, 42};
		
		BinarySearch search = new BinarySearch(array, 11);
		search.search();
	}
}
