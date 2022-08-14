package set;

/*This class maintian the insertion order of the set*/

/*imports*/
import java.util.*;

/*main class*/
public class Linked_hashset {

	/*main method*/
	public static void main(String[] args) {

		/*creating the object of the linked hashset*/
		Set<String> foods = new LinkedHashSet<>();
		
		/*adding some elements to hashset*/
		foods.add("Sausage");
		foods.add("Rice");
		foods.add("Chicken");
		foods.add("Omelette");
		foods.add("Fries");
		
		/*displaying the hashset*/
		System.out.println(foods);
		
		System.out.println("See the insertion list is maintained");
		
	}

}
