package poject_email_application;

/*must imports*/
import java.util.*;

public class Email {

	/*declaring variables we need*/
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	private int defaultPasswordLength = 8;
	
	/*constructor to receive first and lastname*/
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		/*displaying the first and the last name*/
		System.out.println("Email created: " + this.firstName+ " " + this.lastName);
		
		/*calling a method asking for the department and set the department*/
		this.department = setDepartment();
		System.out.println("Deparment is : "+ department);
		
		/*calling a method to generete a random password and displaying*/
		password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : " + password);
		
		
	}
	
	/*just empty constructor good for pracitse*/
	public Email() {
		
	}
	
	/*mehtod to generate a ranodm password*/
	 private String randomPassword(int length) {
		 
		 String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&";
		 char[] Password = new char[length];
		 
		 /*iterating through the array and generate a password*/
		 for(int i = 0; i < length; i++) {
			 
			 int random = (int)(Math.random() * passwordSet.length());
			 Password[i] = passwordSet.charAt(random); 
		 }
		 
		 /*returnign random but as a String*/
		 return new String(Password);
	 }
	
	/*ask for the department*/
	private String setDepartment() {
		/*determining the department*/
		System.out.println("\n\nDEPARTMENT CODES \n1 for sales \n2 for development"
				+ "\n3 for accounting \n0 for none \nEnter department code: s");
		/*creating the scanner*/
		Scanner scan = new Scanner (System.in);
		int choice = scan.nextInt();
		
		/*conditons for the selections*/
		if(choice == 1) {return "Sales";}
		else if (choice == 2) {return "Development";}
		else if (choice == 3) {return "Accounting";}
		else {return "None";}
	}
	
	/*set the mail box capacity*/
	
	/*set the alternamet email*/
	
	/*change the password*/
	
	
	
}
