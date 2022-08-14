package algorithms;

/*this method is used to sort the elements in ascending natural order*/

/*imports*/
import java.util.*;

/*main class*/
public class Sort{

	/*main method*/
	public static void main(String[] args) {
		
		/*creating object of arraylist*/
		ArrayList<Integer> numbers = new ArrayList<>();
		
		/*adding some elements to arraylist*/
		numbers.add(2);
		numbers.add(4);
		numbers.add(9);
		numbers.add(3);
		numbers.add(5);
		
		/*displaying in unsorted order*/
		System.out.println("This is unsorted version os numbers: " + numbers); 
		
		/*displaying in sorted order*/
		Collections.sort(numbers);
		System.out.println("This is sorted version of numbers: " + numbers);
	}
}
