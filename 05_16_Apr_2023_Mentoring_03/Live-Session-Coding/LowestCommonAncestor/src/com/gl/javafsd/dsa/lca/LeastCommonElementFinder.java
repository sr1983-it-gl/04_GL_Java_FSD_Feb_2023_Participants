package com.gl.javafsd.dsa.lca;

import java.util.Iterator;
import java.util.List;

public class LeastCommonElementFinder {

	private List<Integer> ancestorNodes1;
	private List<Integer> ancestorNodes2;
	
	public LeastCommonElementFinder(
		List<Integer> ancestorNodes1, List<Integer> ancestorNodes2) {
		
		this.ancestorNodes1 = ancestorNodes1;
		this.ancestorNodes2 = ancestorNodes2;
	}
	
	public int find() {
		
		List<Integer> bigList = null;
		List<Integer> smallList = null;
		
		if (ancestorNodes1.size() > ancestorNodes2.size()) {
			
			bigList = ancestorNodes1;
			smallList = ancestorNodes2;
		}else if (ancestorNodes1.size() < ancestorNodes2.size()) {
			
			bigList = ancestorNodes2;
			smallList = ancestorNodes1;
		}else {
			
			bigList = ancestorNodes1;
			smallList = ancestorNodes2;
		}
		
		Iterator<Integer> iterator = bigList.iterator();
		
		Integer matchingElement = -1;
		
		while (iterator.hasNext()) {
			
			// 40, 20, 10
			Integer element = iterator.next();
			
			// [30, 10].contains(40) => FALSE
			// [30, 10].contains (20) => FALSE
			// [30, 10].contains (10) => TRUE
			if (smallList.contains(element)) {
				
				matchingElement = element;
				break;
			}
		}
		
		return matchingElement;
	}
}
