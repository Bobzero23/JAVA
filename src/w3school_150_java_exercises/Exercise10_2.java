package w3school_150_java_exercises;

/*12. Write a Java program that takes three numbers as input 
 * to calculate and print the average of the numbers*/

/*needed imports*/
import java.util.*;

/*main class*/
public class Exercise10_2 {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating a scanner object*/
		Scanner object = new Scanner(System.in);
		
		/*asking for user input*/
		System.out.println("Enter a three numbers and press enter after each: ");
		int a = object.nextInt();
		int b = object.nextInt();
		int c = object.nextInt();
		
		/*calculating the avarage and displaying*/
		System.out.println("The avarage is: " + (a+b+c)/3);

		/*closing the scanner object*/
		object.close();
	
	}

}
