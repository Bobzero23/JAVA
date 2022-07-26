package for_loop;
/* for-each = traversing technique to iterate through the elements in an
array/collection*/
		// less steps, more readable
		// less flexible
// need to import this class to be able to use arraylist
import java.util.ArrayList;
//this is my class
public class AnimalsX {
	//this is my main method
	public static void main(String[] args) {


		// String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList<String>();

		/*adding to array list*/
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");

		/*for each*/
		for (String i : animals) { //for every element in animals
			System.out.println(i);// displaying i

		}

	}
}
