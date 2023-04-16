package com.gl.javafsd.milkshakes.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> personsQueue = new LinkedList<>();
		
		personsQueue.add("Raghu");
		personsQueue.add("Kishore");
		personsQueue.add("Ram");
		personsQueue.add("Manoj");
		
		while (!personsQueue.isEmpty()) {
			
			String person = personsQueue.poll();
			
			System.out.println("Person has happened for person " + person);
		}
	}
}
