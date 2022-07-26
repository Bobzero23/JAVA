package checking;
/*needed imports*/
import java.util.*;

/*main class*/
public class Checking_binary_number {

	/* main method */
	public static void main(String[] args) {

		/* creating a scanner object */
		Scanner object = new Scanner(System.in);

		/* asking for user input */
		System.out.println("Enter a binary number to check here: ");
		int a = object.nextInt();

		/* checking if a number is binary */
		if ((isBinary(a)) == true) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		/* closing the scanner */
		object.close();

	}

	/* isBinary method */
	private static boolean isBinary(long p) {
		while (p != 0) {
			if (p % 10 > 1) {
				return false;
			}
			/*I really didnt understanda this*/
			p = p / 10;
		}
		return true;
		}
	}

