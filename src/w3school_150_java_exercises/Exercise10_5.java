package w3school_150_java_exercises;

/*15. Write a Java program to swap two variables*/

/*main class*/
public class Exercise10_5 {

	/*main method*/
	public static void main(String[] args) {

		/*intializing variables*/
		int a = 5; 
		int b = 9;
		int temp;
		
		/*displaying before swapping*/
		System.out.println("BEFORE SWAPPING");
		System.out.println("a = " + a + "\nb = " + b);
		
		/*swapping variables*/
		temp = a;
		a = b;
		b = temp;
		
		/*displaying after swapping swapping*/
		System.out.println("\nAFTER SWAPPING");
		System.out.println("a = " + a + "\nb = " + b);
	}

}
