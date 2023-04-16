package com.gl.javafsd.milkshakes.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class BulkOrderPriorityQueueDemo {

	public static void main(String[] args) {
		
		BulkOrderComparator comparator = new BulkOrderComparator();
		
//		Queue<BulkOrder> queue = new PriorityQueue<>(comparator);
		
		Queue<BulkOrder> queue = new PriorityQueue<>(comparator);
		
		BulkOrder boMango = new BulkOrder("Mango Milkshake", 5);
		BulkOrder boOrange = new BulkOrder("Orange Milkshake", 3);
		BulkOrder boPineApple = new BulkOrder("Pine Apple Milkshake", 10);
		
		// 5, 3, 10
		// 10, 5, 3
		
		queue.add(boMango);
		queue.add(boOrange);
		queue.add(boPineApple);
		
		while (!queue.isEmpty()) {
			
			BulkOrder bulkOrder = queue.poll();
		
			System.out.println(bulkOrder.getItemName() 
					+ ", " + bulkOrder.getNumberOfOrders());
		}		
	}	
}
