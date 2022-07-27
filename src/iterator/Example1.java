package iterator;

/*must imports*/
import java.util.ArrayList;
import java.util.Iterator;

/*  Iterator is an object that can be used to loop through collections,
 *  like ArrayList and HashSet. It is called an "iterator"
 *  because "iterating" is the technical term for looping.*/

/*main class*/
public class Example1 {

	/* main method */
	public static void main(String[] args) {

		/*lets create an arraylist of foods*/
		ArrayList<String> foods = new ArrayList<>();
		
		/*lets add some foods*/
		foods.add("Burger");
		foods.add("Fries");
		foods.add("Chicken");
		foods.add("Rice");
		
		/*now lets loop thro the arraylist using iterator*/
		Iterator<String> it = foods.iterator();
		
		/*I used while loop to check if there is somethng to display*/
		while(it.hasNext()) {
			
		/*lets display the output*/
		System.out.println(it.next());
		
	   }
	}
}
