package com.gl.javafsd.milkshakes.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BulkOrderNormalQueueDemo {

	public static void main(String[] args) {
		
		Queue<BulkOrder> queue = new LinkedList<>();
		
		BulkOrder boMango = new BulkOrder("Mango Milkshake", 5);
		BulkOrder boOrange = new BulkOrder("Orange Milkshake", 3);
		BulkOrder boPineApple = new BulkOrder("Pine Apple Milkshake", 10);
		
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
