package multi_threading;
/*HERE WE GONNA DO THE MULTI THREADING USING LAMBDA EXPRESSION
 * SO THAT WE CAN REDUCE THE LINES OF THE CODE */

/*SOMETHING TO BE CAREFUL ABOUT IF YOU GONNA USE OBJECT INSIDE ANOTHER OBJECT
 * WHICH YOU USED WITH LAMBDA EXPRESSION IS BETTER TO GET RID OF THOSE OBJECTS
 * AND THEN WRITE THEM WHERE THEY GONNA BE USED OBSERVE THE CODE CARFULLY BOB*/

/*main class*/
public class Lambda_expression {

	/* here is our main method */
	public static void main(String[] args) {

		
		/*I GET RID OF THE ONLY ONCE USED OBJECTS*/
			
//		/* here we used lambda expression */
//		Runnable object1 = () -> {
//
//			for (int i = 1; i <= 5; i++) {
//				System.out.println("HI");
//
//				/* here lets use thread and see how it works */
//				try {
//					Thread.sleep(500);
//				} catch (Exception e) {
//				}
//			}
//
//		};

		/* here we used lambda expression */
//		Runnable object2 = () -> {
//			for (int i = 1; i <= 5; i++) {
//				System.out.println("HELLO");
//
//				/* here lets use thread and see how it works */
//				try {
//					Thread.sleep(500);
//				} catch (Exception e) {
//				}
//
//			}
//
//		};

		/* we need a help from Thread class */
		Thread thread1 = new Thread(() -> {

			for (int i = 1; i <= 5; i++) {
				System.out.println("HI");

				/* here lets use thread and see how it works */
				try {Thread.sleep(500);} catch (Exception e) {}
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("HELLO");

				/* here lets use thread and see how it works */
				try {Thread.sleep(500);} catch (Exception e) {}
			}
		});

		/* now lets call the methods */

		/* calling a method */
		thread1.start();

		/* to make time between these two */
		try {Thread.sleep(10);} catch (Exception e) {}

		/* calling a method */
		thread2.start();
	}
}