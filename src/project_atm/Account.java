package project_atm;

/*needed imports*/
import java.text.DecimalFormat;
import java.util.Scanner;


public class Account{

	/*decalaring useful variables*/
	private int costumerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	/*crearing a scanner object*/
	Scanner input = new Scanner(System.in);
	
	/*initializing the decimalformat class for formatting the money*/
	DecimalFormat  moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	/*method of getting costumer number*/
	public int setCostumerNubmer(int costumerNumber) {
		this.costumerNumber = costumerNumber;
		return costumerNumber;
	}
	
	/**/
	public int getCostumerNumber() {
		return costumerNumber;
	}
	
	/**/
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	/**/
	public int getPinNumber() {
		return pinNumber;
	}
	
	/**/
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	/**/
	public double getSavingBalance() {
		return savingBalance;
	}
	
	/*method for calculating checking balance when you withdraw*/
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	/*method for calculating saving balance when you withdraw*/
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	/*method for calculating checking balance when you do deposit*/
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (amount + checkingBalance);
		return checkingBalance;
	}

	/*method for calculating saving balance when you do deposit*/
	public double calcSavingDeposit(double amount) {
		savingBalance = (amount + savingBalance);
		return savingBalance;
	}
	
	/**/
	public void getCheckingWithdrawInput() {
		System.out.println("Checking account balance " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking account");
		double amount = input.nextDouble();
		if((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(checkingBalance);
			System.out.println("New checking account balance " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance can not be negative");
		}
		
	}
	
	public void getSavingWithdraw() {
		System.out.println("Saving account balance " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving account");
		double amount = input.nextDouble();
		if((savingBalance - amount) >= 0) {
			calcSavingWithdraw(savingBalance);
			System.out.println("New saving account balance " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance can not be negative");
		}
	}

	/**/
	public void getCheckingDepositInput() {
		System.out.println("Checking account balance " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit from checking account");
		double amount = input.nextDouble();
		if((checkingBalance + amount) >= 0) {
			calcCheckingWithdraw(checkingBalance);
			System.out.println("New checking account balance " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance can not be negative");
		}
		
	}

	public void getSavingDeposit() {
		System.out.println("Saving account balance " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit from saving account");
		double amount = input.nextDouble();
		if((savingBalance + amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving account balance " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance can not be negative");
		}
	}
}
