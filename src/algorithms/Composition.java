package algorithms;

/*in this code we gonna implement two methods
 * 1. frequency() returns how many times a particular element appear in the collection
 * 2. disjoint() boolean method to check if ther are common elements*/

/*imports*/
import java.util.*;

/*main class*/
public class Composition {

	/*mian method*/
	public static void main(String[] args) {

		/*creating object of the first arraylist*/
		ArrayList<Integer> coll1 = new ArrayList<>();

		/*adding some elements into it*/
		coll1.add(1);
		coll1.add(2);
		coll1.add(3);
		coll1.add(2);
		coll1.add(5);
		coll1.add(6);
		coll1.add(2);
		
		/*using the frequency method*/
		int i = Collections.frequency(coll1, 2);
		System.out.println("The number 2 appers " + i + " times");
		
		/*creating obeject of the second arraylist*/
		ArrayList<Integer> coll2 = new ArrayList<>();
		
		/*adding some elements into it*/
		coll1.add(1);
		coll1.add(2);
		coll1.add(3);
		coll1.add(4);

		/*displaying the common elements*/
		System.out.print("Are there any common elements: ");
		System.out.println(Collections.disjoint(coll1, coll2));
		
		
		
	}

}
