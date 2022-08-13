package map;

/*The map is sorted according to the natural ordering of its keys, what I mean is like abcdefg order*/

/*must import*/
import java.util.*;

/*main class*/
public class Tree_map {

	/*main method*/
	public static void main(String[] args) {

		/*creating a map object using tree map class*/
		Map<String, Integer> letters = new TreeMap<>();
		
		/*adding some object into the map*/
		letters.put("A", 1);
		letters.put("C", 3);
		letters.put("E", 5);
		letters.put("B", 2);
		letters.put("F", 6);
		letters.put("D", 4);
		
		/*displaying the map*/
		System.out.println(letters);
		
	}

}
