package map;

/*this one is same as hashmap the difference is just this one maintains the order of the map*/

/*must import*/
import java.util.*;

/*main class*/
public class Linked_hashmap {

	/*main method*/
	public static void main(String[] args) {

		/*creating object of map using linked hashmap class*/
		Map<String, Integer> weekdays = new LinkedHashMap<>();
		
		/*adding objects to linked hashmap*/
		weekdays.put("Monday", 1);
		weekdays.put("Tuesday", 2);
		weekdays.put("Wednesday", 3);
		weekdays.put("Thursday", 4);
		weekdays.put("Friday", 5);
		
		/*displaying the map, this will display as ordered*/
		for(Map.Entry<String, Integer> day : weekdays.entrySet()) {
			System.out.println(day);
		}
	
	}

}
