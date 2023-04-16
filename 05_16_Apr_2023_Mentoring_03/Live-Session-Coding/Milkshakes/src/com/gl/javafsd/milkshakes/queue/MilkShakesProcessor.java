package com.gl.javafsd.milkshakes.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MilkShakesProcessor {

	private BulkOrder bulkOrders[];
	
	private Queue<BulkOrder> ordersQueue;
	private Result result;
	
	public MilkShakesProcessor(
		BulkOrder[] bulkOrders) {
		
		this.bulkOrders = bulkOrders;
		
		BulkOrderComparator comparator = new BulkOrderComparator();
		this.ordersQueue = new PriorityQueue<>(comparator);
		
		this.result = new Result();
	}
	
	public Result start() {
		
		for (BulkOrder bulkOrder : bulkOrders) {
			
			ordersQueue.add(bulkOrder);
		}
		
		while (!ordersQueue.isEmpty()) {
			
			System.out.println("============================");
			BulkOrder bulkOrder1 = ordersQueue.poll();			
			BulkOrder bulkOrder2 = ordersQueue.poll();
			
			// Possibilities
			//[ 5, 4]
			// [3, 0]
			// [0, 4]
		
			if (bulkOrder1.hasActiveOrders() && bulkOrder2.hasActiveOrders()) {
				
				// decrease (bulkOrder1) -> [5] -> 4
				
				System.out.println("Retriveing 1 order from " + bulkOrder1.getItemName());
				System.out.println();
				
				bulkOrder1.decrementBy(1);
				
				// decrease (bulkOrder2) -> [4] -> 3
				
				System.out.println("Retriveing 1 more order from " + bulkOrder2.getItemName());				
				bulkOrder2.decrementBy(1);

				// 1 second
				// result.incrementTimeBy(1)
				
				System.out.println("Incrementing time by 1 second");
				result.incrementBy(1);		
				
				
				
			}else if (bulkOrder1.hasActiveOrders() && 
					bulkOrder2.hasNoOrders()) {
								
				int orders1 
					= bulkOrder1.getNumberOfOrders();

				System.out.println("Retriveing " + orders1 + " order(s) from " 
						+ bulkOrder1.getItemName());
				System.out.println();
				
				result.incrementBy(orders1);
				System.out.println("Incrementing time by " + orders1 + " second");
				
				result.setStatus("DONE");
				
			}else if (bulkOrder1.hasNoOrders() && bulkOrder2.hasActiveOrders()) {
				
				int orders2 
					= bulkOrder2.getNumberOfOrders();
			
				System.out.println("Retriveing " + orders2 + " order(s) from " 
						+ bulkOrder2.getItemName());
				System.out.println();
				
				result.incrementBy(orders2);
				System.out.println("Incrementing time by " + orders2 + " second");
				
				result.setStatus("DONE");
			}
			
			System.out.println("Total Time Taken" + result.getNoOfSeconds());
			
			if (result.getStatus().equals("DONE")) {
				break;
			}else {
				
				ordersQueue.add(bulkOrder1);
				ordersQueue.add(bulkOrder2);
			}
		}
		
		return result;
	}
}
