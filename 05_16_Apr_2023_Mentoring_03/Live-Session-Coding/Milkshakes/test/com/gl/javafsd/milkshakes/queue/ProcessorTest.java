package com.gl.javafsd.milkshakes.queue;

public class ProcessorTest {

	public static void main(String[] args) {
		
		BulkOrder boMango = new BulkOrder("Mango Milkshake", 5);
		BulkOrder boOrange = new BulkOrder("Orange Milkshake", 4);
		BulkOrder boPineApple = new BulkOrder("Pine Apple Milkshake", 4);
	
		BulkOrder[] bulkOrders = new BulkOrder[] {
				boMango, boOrange, boPineApple
		};
		
		MilkShakesProcessor processror = new MilkShakesProcessor(
				bulkOrders);
		
		Result result = processror.start();		
		System.out.println(result.getNoOfSeconds());
	
	}
}
