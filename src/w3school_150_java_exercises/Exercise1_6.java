package w3school_150_java_exercises;

/*7. Write a Java program that takes a number as input
 *  and prints its multiplication table upto 10*/

/*class needed to be imported*/
import java.util.Scanner;

/*main class*/
public class Exercise1_6 {

	/*main metod*/
	public static void main(String[] args) {

		/*creating the scanner object*/
		Scanner object = new Scanner(System.in);
		
		/*askin for the user input*/
		System.out.println("Enter a number here: ");
		int x = object.nextInt();
		
		/*doing the multiplication table*/
		for(int i = 1; i <= 10; i++) {
			int mult = (x * i);
			System.out.println(x + " x " + i + " = " + mult);
		}
		
		/*closing the scanner*/
		object.close();
	}

}
