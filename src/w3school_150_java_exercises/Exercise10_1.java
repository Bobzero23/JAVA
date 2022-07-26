package w3school_150_java_exercises;

/*11. Write a Java program to print the area and perimeter of a circle*/

/*needed imports*/
import java.util.*;

/*main class*/
public class Exercise10_1 {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating a scanner object*/
		Scanner object = new Scanner(System.in);
		
		/*asking for user input for the area of the circle*/
		System.out.println("Enter the radius to calculate area and circumference of the circle: ");
		double radius = object.nextDouble();
		
		/*computation*/
		double parameter = (2 * radius * Math.PI);
		double area = (radius * radius * Math.PI);
		
		/*displaying the results*/
		System.out.println("Parameter is = " + parameter);
		System.out.println("Area is = " + area);
		
		/*closing the scanner object*/
		object.close();
		
		
		
	}
}
