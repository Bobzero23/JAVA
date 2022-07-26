package while_loop;
/*This code will keep asking user a name until he/she types his/her name or  something using while loop*/

//we will use scanner class to ask for user input
import java.util.Scanner;
//this is my class
public class NameX {
//this is my main method
	public static void main(String[] args) {

		//initianting scanner 
		Scanner input = new Scanner(System.in);
		//initiating String
		String name = "";
		
		//this my while loop
		while(name.isBlank()) {// as long as name is blank
			System.out.print("Please Enter Your name: ");// asks name from the user
			name = input.nextLine();
		}
		//displays hello plus name
		System.out.println("Hello " +name+ "!");
		
		//closing the Scanner
		input.close();

	}

}
