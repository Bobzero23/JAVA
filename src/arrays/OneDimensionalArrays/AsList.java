package arrays.OneDimensionalArrays;

/*HERE WE GONNA SEE HOW TO US asList*/

/*this returns a fixed-size list backed by array*/

/*must imports*/
import java.util.*;

/*main class*/
public class AsList {

	/*main method*/
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		/*creating an array*/
		String[] Names = {"Bobzero", "TheProblem", "Recep", "GTA"};
		
		/*using as list*/
		List Name = Arrays.asList(Names);

		/*displaying the results*/
		System.out.println(Name);
	}

}
