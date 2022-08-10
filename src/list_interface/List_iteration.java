package list_interface;

/*In this code we gonna see how to iterate a list using for loop and get method*/

/*must import*/
import java.util.*;

/*main method*/
public class List_iteration {

	/*main derived method*/
	public static void main(String[] args) {

		/*creatin a list*/
		List<String> list = new ArrayList<>();
		
		/*checking if the list is empty or not*/
		System.out.println(list.isEmpty());
		
		/*adding some elements of the list*/
		list.add("John");
		list.add("Josh");
		list.add("Ahmed");
		list.add("Mufasa");
		
		/*displaying the list using the normal way*/
		System.out.println(list);
		
		/*displaying the list while iterating the elements*/
		for(int i = 0; i<list.size(); i++ ) {
			System.out.print(list.get(i) + " ");
		}
		
		/*checking is the list contains "Ahmed"*/
		System.out.println("\n" + list.contains("Ahmed"));
		
		/*returning the size of the list*/
		System.out.println("The size of the list is: " + list.size());
		
		/*returning the hashcode of the list*/
		System.out.println("The hash code of the list is: " + list.hashCode());
		
		/*checking if the list is empty or not*/ 
		System.out.println(list.isEmpty());
	
	}

}
