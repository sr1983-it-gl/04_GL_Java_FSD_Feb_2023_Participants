package com.gl.javafsd.milkshakes.queue;

import java.util.Comparator;

public class BulkOrderComparator 
	implements Comparator<BulkOrder> {

	@Override
	public int compare(BulkOrder o1, BulkOrder o2) {
		
		System.out.println("Compare called for " 
		+ o1.getItemName() + "," + o1.getNumberOfOrders() + "==" 
		+ o2.getItemName() + "," + o2.getNumberOfOrders());
		
		int value1 = o1.getNumberOfOrders();
		int value2 = o2.getNumberOfOrders();
		
		// descending
		if (value1 < value2) {
			return +1;
		}else if (value1 > value2) {
			return -1;
		}else {
			return 0;
		}
	}
}
