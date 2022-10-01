package classes;

//import scanner class
import java.util.Scanner;

// class
public class Scanner_class {
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner scanner = new Scanner(System.in);
		
		/*asking input from user*/
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("What is your favorite food: ");
		String food = scanner.nextLine();		
		System.out.println("How old are you: ");
		int age = scanner.nextInt();
		
		/*displaying the output*/
		System.out.println("Hello "+name);
		System.out.println("You are " +age + " years old");
		System.out.println("You like " +food+ " a lot ");

		//better to close the scanner
		scanner.close();
	}

}
