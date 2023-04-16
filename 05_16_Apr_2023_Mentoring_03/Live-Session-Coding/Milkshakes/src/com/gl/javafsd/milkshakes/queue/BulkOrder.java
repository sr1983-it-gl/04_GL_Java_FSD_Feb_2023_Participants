package com.gl.javafsd.milkshakes.queue;

public class BulkOrder {

	private String itemName;
	private int numberOfOrders;
	
	public BulkOrder(String itemName, int numberOfOrders) {
		
		this.itemName = itemName;
		this.numberOfOrders = numberOfOrders;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getNumberOfOrders() {
		return numberOfOrders;
	}
	public void setNumberOfOrders(int numberOfOrders) {
		this.numberOfOrders = numberOfOrders;
	}
	
	public void decrementBy(int order) {
		
		numberOfOrders = numberOfOrders - order;
	}
	
	public boolean hasActiveOrders() {

		if (numberOfOrders > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean hasNoOrders() {
		
		return !hasActiveOrders();
	}
}
