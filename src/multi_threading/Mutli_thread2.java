package multi_threading;
/*HERE WE GONNA DO THE SAME THING WE DID IN MULTI THREAD1 USING INTERFACE*/
/*THE THING IS THIS INTERFACE DOESNT HAVE RUN METHOD AND IT IS JAVA_8.FUNCTIONAL INTERFACE*/
/*FOR THAT WE GONNA NEED A HELP FROM A THREAD CLASS ANYWAY*/

/*demo class 1*/
class Hi2 implements Runnable {

	/* this method will display hi 5 times */
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("HI");

			/* here lets use thread and see how it works */
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

/* demo class 2 */
class Hello2 implements Runnable {

	/* this method will display HELLO 5 times */
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("HELLO");

			/* here lets use thread and see how it works */
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}

		}
	}
}

/* here is our main class */
public class Mutli_thread2 {

	/* here is our main method */
	public static void main(String[] args) {

		/* lets creat some objects for our classes */
		Runnable object1 = new Hi2();
		Runnable object2 = new Hello2();

		/* we need a help from Thread class */
		Thread thread1 = new Thread(object1);
		Thread thread2 = new Thread(object2);

		/* now lets call the methods */

		/* calling a method */
		thread1.start();

		/* to make time between these two */
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}

		/* calling a method */
		thread2.start();

	}

}
