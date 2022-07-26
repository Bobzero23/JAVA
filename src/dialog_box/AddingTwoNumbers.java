package dialog_box;
import javax.swing.JOptionPane;
// to use the Dialog box we need to import the above class

public class AddingTwoNumbers {
// this is my class called adding two numbers
	
	public static void main(String[] args) {
	// this is my main method 
		
		
		String firstNumber;// first string to be entered
		String secondNumber;// second string to be entered

		int number1; // first number to be added
		int number2; // second number to be added 
		int sum; // the sum of two numbers 
		
		firstNumber = JOptionPane.showInputDialog(null,"Enter the first number: ");
		// above reads the first string user enters
		secondNumber = JOptionPane.showInputDialog(null,"Enter the second number: ");
		// above reads the second string user enters
		
		number1 = Integer.parseInt(firstNumber);
		//above converts the first number to Integer
		number2 = Integer.parseInt(secondNumber);
		//above converts the second number to Integer
		
		sum = (number1 + number2); // adding the numbers
		
		JOptionPane.showMessageDialog(null, "the sum is: " + sum);
		// above displays the result
	}

}
