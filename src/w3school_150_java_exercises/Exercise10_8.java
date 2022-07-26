package w3school_150_java_exercises;

/*needed imports*/
import java.util.Scanner;

/*18. Write a Java program to multiply two binary numbers*/

/*main class*/
public class Exercise10_8 {

	/*main method*/
	public static void main(String[] args) {

		/*creating the scanner object*/
		Scanner object = new Scanner(System.in);

		/*asking for the user input*/
		System.out.println("Enter the first binary number here: ");
		String first = object.next();
		System.out.println("Enter the second binary nubmer here: ");
		String second = object.next();
		
		/*converting to intiger so we can multiply them*/
		/*the 2 in the parameter describes the radix*/
		int a = Integer.parseInt(first, 2);
		int b = Integer.parseInt(second, 2);
		
		
		/*calculation*/
		int sum = (a * b);
		
		/*displaying the results*/
		System.out.println("The sum is " + Integer.toBinaryString(sum));
		
		/*closing the scanner object*/
		object.close();
		
		
	}

}
