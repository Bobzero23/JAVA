package data_structure_and_algorithm_dsa;
/*needed class*/
import java.util.LinkedList;
import java.util.Queue;

/*class*/
public class Queue_demo1 {
	
	/*main method*/
	public static void main(String[] args) {
		
		// *****************************************************
		
		// Queue = FIFO data structure. First-In First-Out
		//		   A collection designed for holding elements prior to processing
		//		   Linear data structure
		
		//         enqueue = offer()
		//         dequeue = poll()
		
		// Where are queues useful?
		
		// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
		// 2. Printer Queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
		
		// *****************************************************
		
		/*queue is an interfance so we cant create instance of interface
		 * and it only have two class to use and one of em is linked list*/
		Queue<String> queue = new LinkedList<String>();
		
		/*adding people to the queue*/
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		//System.out.println(queue.isEmpty());
		//System.out.println(queue.size());
		//System.out.println(queue.contains("Harold"));
		
		//System.out.println(queue.peek());
		//queue.poll();
		//queue.poll();
		//queue.poll();
		//queue.poll();
					
		System.out.println(queue);
		
	}
}


