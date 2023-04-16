import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumTime {

	// 1. Declare and initialize all variables and objects
	int seconds;
	Scanner sc = new Scanner(System.in);
	
	PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
	
	// 2. Get data from user and add to queue
	public void getData() {
		System.out.println("Total number of orders for Mango milkshake");
		queue.add(sc.nextInt());
		
		System.out.println("Total number of orders for Orange milkshake");
		queue.add(sc.nextInt());
		
		System.out.println("Total number of orders for Pineapple milkshake");
		queue.add(sc.nextInt());
	}
	
	// 3. Find the minimum time required to fill the cups
	public void findMinimumTime() {
		Iterator<Integer> list = queue.iterator();
		
		while(!queue.isEmpty()) {
			int val1 = 0, val2 = 0;
			
			//get top 2 priority values
			if(list.hasNext()) {
				val1 = queue.remove();
			}
			if(list.hasNext()) {
				val2 = queue.remove();
			}
			
			// check if there is 0 in any of the variables and take necessary steps
			if(val1 == 0 && val2 >0) {
				seconds += val2;
				break;
			}
			if(val1 > 0 && val2 == 0) {
				seconds += val1;
				break;
			}
			
			// if both the variables have value >0 then add a second and decrease both the variable value by 1
			if(val1>0 && val2>0) {
				val1--;
				val2--;
				seconds++;
			}
			
			// If any of the variable has value >0 add then back into the queue
			if (val1>0) {
				queue.add(val1);
			}
			if(val2>0) {
				queue.add(val2);
			}
		}
	}
	
	public static void main(String[] args) {
		
		// 1. create object
		MinimumTime minimumTime = new MinimumTime();
		
		// 2. Implement the methods
		minimumTime.getData();
		minimumTime.findMinimumTime();
		System.out.println("\nMinimum time needed to deliver all orders is: "+minimumTime.seconds);
	}
}
