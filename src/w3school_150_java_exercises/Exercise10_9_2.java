package w3school_150_java_exercises;

/*19. Write a Java program to convert a decimal number to binary number*/


/*needed imports*/
import java.util.*;

/*main class*/
public class Exercise10_9_2 {

	
	/*main method*/
	public static void main(String[] args) {

		/*creating scanner object*/
		Scanner object = new Scanner(System.in);
		
		/*asking for user input*/
		System.out.println("Enter a decimal number here: ");
		int  decimal = object.nextInt();
		
		/*converting to binary*/
		String bin = Integer.toBinaryString(decimal);
		
		/*dispalying the output*/
		System.out.println(bin);
		
		/*closing scanner*/
		object.close();
		
		
	}

}
