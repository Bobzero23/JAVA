package w3school_150_java_exercises;

/*needed imports*/
import java.util.*;

/*main class*/
public class Exercise10_3 {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating a scanner object*/
		Scanner object = new Scanner(System.in);
		
		/*intro*/
		System.out.println("ENTER THE FOLLOWING TO CALCULATE THE PERIMETER OF TRIANGLE");
		
		/*asking for user input*/
		System.out.println("Enter the base: ");
		double a = object.nextDouble();
		System.out.println("Enter the side: ");
		double b = object.nextDouble();
		System.out.println("Enter the other side: ");
		double c = object.nextDouble();
		
		/*calculationg and displaying the result*/
		System.out.println("The perimeter is: " + (a+b+c) );
		
		/*intor*/
		System.out.println("\n\nENTER THE FOLLOWING TO CALCULATE THE AREA OF TRIANGLE");
		
		/*asking for user input*/
		System.out.println("Enter the base: ");
		double x = object.nextDouble();
		System.out.println("Enter the height: ");
		double y = object.nextDouble();
		
		/*calculating and displaying the results*/
		System.out.println("The area is: " + (x*y)/2);
		
		/*closing the scanner*/
		object.close();
	}
}
