package w3school_150_java_exercises;

/*20. Write a java program to convert a decimal number to hexadecimal number*/

/*must imports*/
import java.util.Scanner;

/*main class*/
public class Exercise20 {

	public static void main(String[] args) {

		/* creating the scanner object */
		Scanner scan = new Scanner(System.in);

		/* asking for a user input */
		System.out.println("Enter the decimal number here: ");
		int input1 = scan.nextInt();

		int i;
		char c;
		String reminder = "", reversed = "";
		char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

		/* converting to hexadecimal */
		while (input1 > 0 ) {

			i = input1 % 16;
			reminder  = hex[i] + reminder;
			input1 = input1 / 16;
			
		} 
		
		
		/*reversing the string */
		for(int x = 0; x < reminder.length(); x++) {
		    c = reminder.charAt(x);
			reversed = c + reversed;
			
		}
		
		/*displaying the results*/
		System.out.println(reminder);

		/*closing the scanner */
		scan.close();
	}
}
