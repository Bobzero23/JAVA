package project_atm;


/*Needed imports*/
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;


public class OptionMenu extends Account{

	/*creating scanner object*/
	Scanner menuInput = new Scanner(System.in);
	
	/*initializing the decimalformat class for formatting the money*/
	DecimalFormat  moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	/*storing data of account and pin mapping*/
	HashMap <Integer, Integer> data = new HashMap <Integer, Integer>();
	
	/*a method for logging in*/
	public void getLogin() throws IOException {
		
		int x = 1;
		
		do {
			
			try {
				
				/*costumers' details*/
				data.put(0000, 1111);
				data.put(2222, 3333);
				
				/*Welcoming a costumer*/
				System.out.println("Welcome to ATM Project ");
				
				/*asking for a costumer number*/
				System.out.println("Please Enter your costumer number: ");
				setCostumerNubmer(menuInput.nextInt());
				
				/*asking for a pin number*/
				System.out.println("Please Enter your PIN number: ");
				setPinNumber(menuInput.nextInt());

			}
			catch(Exception e){
				System.out.println("\n" + "Invalid characters (s). Only numbers" + "\n");
				x = 2;
			}
			
			/**/
			int cn = getCostumerNumber();
			int pn = getPinNumber();
			
			/**/
			if(data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			}else 
				System.out.println("\n" + "Wrong costumer number or pin number" + "\n");
			
		}while(x == 1);
	}
	
	/*method for getting account*/
	public void getAccountType() {
		
		/*giving options to the costumer after loging in*/
		System.out.println("Please select the account you want to access");
		System.out.println("Type 1 for Checking account ");
		System.out.println("Type 2 for Saving account");
		System.out.println("Type 3 to exit ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1 : 
			getChecking();
		break;
		
		case 2 : 
			getSaving();
		break;
		
		case 3 :
			System.out.println("Thank you for using this ATM..");
		break;
		 	
		default:
			System.out.println("Invalid input");
		
		
		}
		
		
	}
	
	/*method for checking account*/
	public void getChecking() {

		/*options for costumers if they wanna check account*/
		System.out.println("Checking accout: ");
		System.out.println("Type 1 for viewing balance");
		System.out.println("Type 2 for withdraw funds");
		System.out.println("Type 3 for deposit funds");
		System.out.println("Type 4 for exit");
		System.out.println("choice: ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
			case 1 : 
			System.out.println("Checking account balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
			case 2 : 
				getCheckingWithdrawInput();
				getAccountType();
				break;
				
			case 3 :
				getCheckingDepositInput();
				getAccountType();
				break;
				
			case 4 :
				System.out.println("Thank you for using this ATM");
				break;
				
			case 5 : 
				System.out.println("\n" + "Invalid choice" + "\n");
				getChecking();
	
		}
		
		
	}

	/*method for saving account*/
	public void getSaving() {
		
		/*options if costumers choose saving account*/
		System.out.println("Saving accout: ");
		System.out.println("Type 1 for viewing balance");
		System.out.println("Type 2 for withdraw funds");
		System.out.println("Type 3 for deposit funds");
		System.out.println("Type 4 for exit");
		System.out.println("choice: ");
		
int selection = menuInput.nextInt();
		
		switch (selection) {
			case 1 : 
			System.out.println("Saving account balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
			case 2 : 
				getCheckingWithdrawInput();
				getAccountType();
				break;
				
			case 3 :
				getCheckingDepositInput();
				getAccountType();
				break;
				
			case 4 :
				System.out.println("Thank you for using this ATM");
				break;
				
			case 5 : 
				System.out.println("\n" + "Invalid choice" + "\n");
				getChecking();
	
		}
	}
}


