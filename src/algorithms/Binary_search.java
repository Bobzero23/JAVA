package algorithms;

/*we can search the position of a particular element using binary search*/

/*imports*/
import java.util.*;

/*main class*/
public class Binary_search {

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
		
		/*using binary search*/ /*searching for positions of number 4*/
		int i = Collections.binarySearch(numbers, 4);
		System.out.println("The position of number 4 is: " + i);
		
	}
}
