package string;

/*THIS CODE IS FOR REVERSING THE STRING */

/*must imports*/
import java.util.*;

/*main class*/
public class Reverse {

	/*main class*/
	public static void main(String[] args) {
		
		String reversed = "";
		char Char;
		/*creating the scanner object*/
		Scanner scan = new Scanner(System.in);
		
		/*asking for the user input*/
		System.out.println("Enter the word you want to reverse: ");
		String normal = scan.next();
		
		for(int i = 0; i < normal.length(); i++) {
			Char = normal.charAt(i);
			reversed = Char + reversed;
		}
		System.out.println(reversed);
	
		scan.close();
	}
}
