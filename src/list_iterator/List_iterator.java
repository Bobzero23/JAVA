package list_iterator;

/*This interface extends iterator but the difference is that, 
 * this one can iterate bi-directional, I mean forward and backward*/

/*imports*/
import java.util.*;

import javax.swing.JSpinner.ListEditor;

/*main class*/
public class List_iterator {

	/*main method*/
	public static void main(String[] args) {

		/*creating object of arraylist*/
		List<String> names = new ArrayList<>();
		
		/*adding some objects into it*/
		names.add("Bobzero");
		names.add("TheProblem");
		names.add("Ninja");
		names.add("GTA");
		
		/*creating object of listIterator*/
		ListIterator<String> name = names.listIterator();
		
		/*iterating forward using list itertor*/
		System.out.println("DISPLAYING FORWARDS");
		while(name.hasNext()) {
			System.out.println(name.next());
		}
		
		/*iterating backward using list iterator*/
		System.out.println("\nDISPLAYING BACKWARDS");
		while(name.hasPrevious()) {
			System.out.println(name.previous());
		}
		
	}

}
