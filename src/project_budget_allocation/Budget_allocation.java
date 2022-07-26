package project_budget_allocation;

/*THIS CODE WILL CALCULATE THE AMOUNT THAT A USER CAN SPEND
 * IN EACH PROPORTION ACCORDING TO HIS MONEY USAGE*/

/*needed imports*/
import java.util.*;


/*main class*/
public class Budget_allocation {

	/*main method*/
	public static void main(String[] args) {
		
		/*declaring variables*/
		int count = 1;
		double balance = 0.1;
		double amountPercentage;
		
		/*creating a scanner object*/
		Scanner scan = new Scanner(System.in);
		
		/*asking how much he has*/
		System.out.println("How much do you have: ");
		double total = scan.nextDouble();
		
		/*computation*/
		while(total >= 0.0) {
			System.out.println("Enter your " + count +" usage "
					+"or enter negative number to exit.");
			double usage = scan.nextDouble();
			
			if(usage < 0.0) {
				System.out.println("Have a good day..");
				break;
			}else {
				
				if(balance <= 0.0) {
					System.out.println("You have already used all the money...");
					break;
				} else {
				balance = total - usage;
				amountPercentage = (usage/total)*100;
				System.out.println("You have used "+amountPercentage +"% of your money"
						+ " and the new balance is " + balance);
				total = total - usage;
				}
			
			}
			count++;
		}
		
		/*closing scanner object*/
		scan.close();

	}

}
