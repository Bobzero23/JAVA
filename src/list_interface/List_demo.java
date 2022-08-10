package list_interface;

/*The List interface in Java provides a way to store the ordered collection
 * it allows duplicate and it supports poisitional insertion and access
 * classes that inherits list are arraylist, vector, stack and linkedlist*/

/*must imports*/
import java.util.*;

/*main class*/
public class List_demo {

	/*main derived method*/
	public static void main(String[] args) {

		/*creating object of list interface*/
		List<Integer> list1 = new ArrayList<>();
		
		/*adding two elements to the list we created by index*/
		list1.add(0, 1);
		list1.add(1, 2);
		
		/*displaying the list*/
		System.out.println(list1);
		
		/*creating the second list*/
		List<Integer> list2 = new ArrayList<>();
		
		/*adding three elements to the list */
		/*addint the second list to be the first indext of first list using addAll method*/
		/*displaying the first list*/
		/*removing the elements of the index 1 of the first list*/
		/*displaying the list*/
		/*displaying only the third index of the first list using get method*/
		/*setting the zero index element as 5*/
		/*displaying the list (first list)*/
		
		
	}

}
