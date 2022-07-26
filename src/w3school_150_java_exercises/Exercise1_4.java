package w3school_150_java_exercises;

/*5. Write a Java program that takes two numbers as input
 *  and display the product of two numbers.*/

/*needed classes to import*/
import java.util.Scanner;

/*main class*/
public class Exercise1_4 {

	/*main method*/
	public static void main(String[] args) {

		/*creating the scanner object*/
		Scanner object = new Scanner(System.in);
		
		/*asking the first input from a user*/
		System.out.println("Enter the first input: ");
		int a = object.nextInt();
		
		/*asking the second input from a user*/
		System.out.println("Enter the second input: ");
		int b = object.nextInt();
		
		/*finding the product*/
		int c = (a*b);
		
		/*displaying the result*/
		System.out.println("The product is: " + c);
		
		/*closing the scanner*/
		object.close();

		
	}

}
