package assertion;

/*Assertion test the correctness of the program using assert statement in Java*/

/*main class*/
public class Demo {

	/*main derived method*/ 
	public static void main(String[] args) {

		/*initializing a variable*/
		int year = 2000;
		
		/*using assertion expression: expression;*/
		assert year <= 2005 : "Won't attend the race";
		
		/*displaying the result*/
		System.out.println("The year is: " + year);
	
	}

}
