package collection;

/*There are many ways of iteratin a collection but this one is what I prefer*/

/*must imports*/
import java.util.*;

/*mian class*/
public class Collection_iteration {

	/*main derived method*/
	public static void main(String[] args) {
	
		/*creating a collection interface*/
		Collection<String> collection = new ArrayList<>();
		
		/*adding some objects into it*/
		collection.add("Mango");
		collection.add("Cherry");
		collection.add("Apple");
		collection.add("Orange");
		collection.add("Banana");
		
		/*iterating using inhanced for loop*/
		for(String fruit : collection) {
			System.out.println(fruit);
		}
		
	}

}
