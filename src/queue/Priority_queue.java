package queue;

/*in this class element with max value in ASCII will havae the max priority I mean abcdefghijkl..*/

/*must import*/
import java.util.*;

/*main class*/
public class Priority_queue {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating object of the priority queue*/
		PriorityQueue<String> priority = new PriorityQueue<>();
		
		/*adding some objects into it*/
		priority.add("House");
		priority.add("Bike");
		priority.add("Car");
		priority.add("Dance");
		priority.add("Apple");
		priority.add("Zebra");
		
		/*displaying the queue*/
		System.out.println(priority);
		
		/*displaying the top object of the queue*/
		System.out.println("The top object is: " + priority.peek());
		
		/*displaying the top and removing it*/
		System.out.println("The removed top is: " + priority.poll());
		
		/*displaying the queue*/
		System.out.println(priority);
	}

}
