package project_investment_earnings;

/*this project is used to calculate earnings of the week and also the losses too*/

/*needed imports*/
import java.util.*;

/*main class*/
public class Investment_earnings {

	/* main method */
	public static void main(String[] args) {

		/* initializing some variables */
		int day = 1;
		double earnings = 0.0;

		/* creating a scanner object */
		Scanner scan = new Scanner(System.in);

		/* asking for user input */
		System.out.println("Enter the buying price here: ");
		double buyingPrice = scan.nextDouble();

		/*calculation*/
		while (true) {
			System.out
					.println("Enter the closing prce of the day " + day + "" + ", or to exit inter a negative number");
			double closingPrice = scan.nextDouble();

			if (closingPrice < 0.0) {
				System.out.println("Have a good day..");
				break;
				
			} else {
				earnings = closingPrice - buyingPrice;

				if (earnings < 0.0) {
					System.out.println("on day " + day + " you lost: " + earnings);
				} else {
					System.out.println("on day " + day + " you win: " + earnings);
				}
			}
			day++;
		}

		/*closing the scanner*/
		scan.close();
	}
}
