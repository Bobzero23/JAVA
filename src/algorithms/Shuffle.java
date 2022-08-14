package algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*This method is used to destroy any kind of order of data structure*/

/*main class*/
public class Shuffle {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating object of arraylist*/
		ArrayList<Integer> numbers = new ArrayList<>();
		
		/*adding elements to arraylist in order*/
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		/*displaying the arraylist before shuffle*/
		System.out.println("This is before shuffle: " + numbers);
		
		/*displaying the arraylist after shuffle*/
		Collections.shuffle(numbers);
		System.out.println("This is after shuffle: " + numbers);
		
	}
}
