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
	}

}
