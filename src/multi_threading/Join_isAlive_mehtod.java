package multi_threading;
/*this method is used when you are using thread and you
 * dont wanna do anything to interrupt the thread
 * until their work is done*/

/*and also the isalive method inatumika kuangalia 
 * kama kuna thread ambayo inaendelea kufanya kazi*/

/*demo class 1*/
class Hi3 implements Runnable {

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
class Hello3 implements Runnable {

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
public class Join_isAlive_mehtod {

	/* here is our main method */
	public static void main(String[] args) {

		/* lets creat some objects for our classes */
		Runnable object1 = new Hi3();
		Runnable object2 = new Hello3();

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
	
		/*if we use isAlive method here will return true*/
		System.out.println(thread1.isAlive());
		
		/*if you print something here before join method
		 * it will interrupt the fisrt two threads*/
		
		/*lest put some joins here*/
		/*for this we gonna have to trhow exception*/
		try {
			thread1.join();			
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/*printing bye*/
		System.out.println("Bye then..");
		
		/*but if use isAlive method here will return false*/
		System.out.println(thread2.isAlive());

	}

}
