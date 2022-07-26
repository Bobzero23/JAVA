package colection_and_generics;
/*we need to import HashMap*/
import java.util.HashMap;

public class Hash_map {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*this is how you store integers variable normally*/
		int a = 4;
		int b = 3;
		int c = 5;
		int d = 9;
		
		/*declaring hashmap*/
		HashMap<String, Integer> numbers = new HashMap<String, Integer>();
		
		/*initializing the values*/
		numbers.put("a", 4);
		numbers.put("b", 3);
		numbers.put("c", 5);
		numbers.put("d", 9);
		
		/*displaying the hashmap*/
		System.out.println(numbers);
		
		/*displaying one element*/
		System.out.println("the number is: " + numbers.get("c"));
		
		/*to delete an element*/
		numbers.remove("d");
		
		/*displaying after removing*/
		System.out.println(numbers);
		
		/*checking if contains a certain value*/
		System.out.println(numbers.containsValue(7));
		
		/*checking if contains a certain key*/
		System.out.println(numbers.containsKey("c"));
		
		/*checking the size of the list*/
		System.out.println(numbers.size());
		
		/*replacing a value*/
		numbers.replace("a", 10);
		
		/*displaying after replacing*/
		System.out.println(numbers);
		
		/*displaying only values*/
		System.out.println(numbers.values());
		
		/*displaying only keys*/
		System.out.println(numbers.keySet());
		
	}

}
