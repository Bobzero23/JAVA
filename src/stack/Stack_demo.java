package stack;

/*is the class of collection with the principle of LIFO - last in first out
 * its popular operations are push and pop also provided functions like search, peek and empty*/

/*since stack extends vector we can use all the vector method here with no problem*/

/*must import*/
import java.util.*;

/*main class*/
public class Stack_demo {

	/*main derived method*/
	public static void main(String[] args) {

		/*creating a stack*/
		Stack<Integer> stack = new Stack<>();
		
		/*adding some objects*/
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(8);
	
		/*displaying the stack*/
		System.out.println(stack);
		
		/*displaying the top object*/
		System.out.println(stack.peek());
		
		/*removing object from the stack*/
		stack.pop();
		
		/*displaying the stack*/
		System.out.println(stack);
		
		
	}
}
