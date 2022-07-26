package w3school_150_java_exercises;

/*19. Write a Java program to convert a decimal number to binary number*/

/*needed imports*/
import java.util.*;

/*main class*/
public class Exercise10_9_1 {

	/*main method*/
	public static void main(String[] args) {

		/*lets create an array for reversing*/
		int[] remainder = new int[100];
		int i = 1;
		
		/* creating a scanner object */
		Scanner object = new Scanner(System.in);

		/* asking for user input */
		System.out.println("Enter decimal number here: ");
		int dec_num = object.nextInt();
		
		/* caluclation */
		while (dec_num != 0) {

			remainder[i++] = (dec_num % 2);
			dec_num = dec_num / 2;
		}
		
		/*reversing and displaying the results*/
		for(int j = i - 1; j > 0; j--) {
			System.out.print(remainder[j]);
		}
		
		
		/*closing Scanner object*/
		object.close();
	}

}
