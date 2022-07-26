package w3school_150_java_exercises;

/*6. Write a Java program to print the sum (addition), 
 * multiply, subtract, divide and remainder of two numbers*/

/*class needed to be imported*/
import java.util.Scanner;

/*main class*/
public class Exercise1_5 {

	/*main method*/
	public static void main(String[] args) {

		/*creating the scanner object*/
		Scanner object = new Scanner(System.in);
		
		/*asking the first input from the user*/
		System.out.println("Enter the first input: ");
		int a = object.nextInt();
		
		/*asking the second input from the user*/
	    System.out.println("Enter the second input: ");
	    int b = object.nextInt();
	    
	    /*doing the operations and displaying*/
	    System.out.println(a+b);
	    System.out.println(a*b);
	    System.out.println(a-b);
	    System.out.println(a/b);
	    System.out.println(a%b);
	    
	    /*closing the scanner object*/
	    object.close();
	}

}
