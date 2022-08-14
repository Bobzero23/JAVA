package algorithms;

/*This is how to find the maximum and the minumum values in the collectoin*/

/*imports*/
import java.util.*;

/*main class*/
public class Finding_extreme_values {

	/*main method*/
	public static void main(String[] args) {

		/*creaeting object of the Arraylist*/
		ArrayList<Integer> ints = new ArrayList<>();

		/*adding some elements into it*/
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(2);
		ints.add(5);
		ints.add(6);
		
		/*displaying the minimum value of the collection*/
		System.out.println("The minumum value is: " + Collections.min(ints));

		/*displaying the maximum value of the collection*/
		System.out.println("The maximum value is: " + Collections.max(ints));

	}

}
