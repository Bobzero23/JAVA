package colection_and_generics;
/*SET IS SAME AS LIST BUT THE MAIN DIFFERENCES ARE
 * SET WONT DISPLAY DUPLICATED ELEMENTS
 * SET WONT DISPLAY ELEMENTS IN ORDER
 * BUT TO DISPLAY THEM IN ORDER WE CAN USEE TreeSet*/

/*note: 'add' is a boolean method in collections*/

/*needed imports*/
import java.util.*;

/*main class*/
public class Set_demo {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating a set object*/
		Set<Integer> values = new HashSet<>();
		
		/*but to display elements in order use this*/
		//Set<Integer> values = new TreeSEt<>();
		
		
		/*proof that add is boolean method*/
		System.out.println(values.add(3));
		System.out.println(values.add(6));
		System.out.println(values.add(5));
		System.out.println(values.add(8));
		System.out.println(values.add(4));
		System.out.println(values.add(3));
		
		/*just making some space*/
		System.out.println("\n");
	
		/*displaying the results*/
		/*proof that set wont display duplicated*/
		/*proof that set wont display in order*/
		for(int i : values) {
			System.out.println(i);
		}
		
		
	}
}
