package recursion;

/*Recursion is the technique of making a function call itself. 
 * This technique provides a way to break complicated 
 * problems down into simple problems which are easier to solve.*/

/*main class*/
public class Demo {

	/* main method */
	public static void main(String[] args) {

		/* declaration */
		/* making a class call itself */
		int demo = sum(10);

		/* displaying the result */
		System.out.println(demo);

	}

	/* the method which we will use for recursion */
	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}
}
