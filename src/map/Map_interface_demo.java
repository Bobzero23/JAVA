package map;

/*Map as the name refers, it represents mapping between key and value
 *  tho it can't contain duplicate values, hashmap wont maintain the order of it*/


/*must import*/
import java.util.*;
import java.util.Map.Entry;

/*main class*/
public class Map_interface_demo {

	/*main method*/
	public static void main(String[] args) {

		/*creatign object of a map*/
		Map<String, Integer> map = new HashMap<>();
		
		/*giving some objects to the map*/
		map.put("January", 1);
		map.put("February", 2);
		map.put("March", 3);
		map.put("April", 4);
		
		/*displaying them with for loop*/
		for(Map.Entry<String, Integer> me : map.entrySet()) {
			System.out.print(me.getKey() + ":" + me.getValue() + "\n");
			
		}
		
		/*what happens if we display without for loop*/
		/*it will display with no order but really it doesn't matter*/
		System.out.println(map);
	}

}
