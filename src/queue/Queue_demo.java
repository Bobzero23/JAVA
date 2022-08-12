package queue;

/*This interface supports first in first out concept, since queue is an interface
 * we need a class to create object of it and linkedlist and priorityqueue are popular*/

/*must import*/
import java.util.*;

/*main class*/
public class Queue_demo {

	/*main method*/
	public static void main(String[] args) {

		/*creating object of the queue*/
		Queue<Integer> queue = new LinkedList<>();
		
		/*adding Integer objects from 1-5 using for loop*/
		for(int i = 1; i <= 5; i++) {
			queue.add(i);
		}
		
		/*displaying the queue*/
		System.out.println(queue);
		
		/*creating a variable for remove() method*/
		/*the variable type is int bcoz our queue is integer*/
		int rem = queue.remove();
		
		/*displaying the removed object*/
		System.out.println("The removed object is: " + rem);
		
		/*creating the object of size() method*/
		int siz = queue.size();
		
		/*displaying the size of the queue*/
		System.out.println("The size of the queue is: " + siz);
		
		/*you can also use the method this way*/
		System.out.println("The head of the queue is: " + queue.peek());
		
	}

}
