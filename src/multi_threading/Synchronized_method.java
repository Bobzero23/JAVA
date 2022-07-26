package multi_threading;
/*okay this method is used when that you have multiple threads 
 * which are running the same method, we use this method to 
 * make one method wait until the other is finished running*/

/*Demo class*/
class Counter{

	/*declaring a variable*/
	int count;
	
	/*creating the method*/
	public void increment() {
		
		/*incrementing the count*/
		count++;
	}
}
/*main class*/
public class Synchronized_method {

	/*main method*/
	public static void main(String[] args) throws Exception {

		/*creaitng the object of the class*/
		Counter cntr = new Counter();
		
		
		/*creating a thread object*/
		Thread thread4 = new Thread (new Runnable() {
			public void run() {
				for (int i = 1; i <=1000; i++) {
					cntr.increment();
				}
			}
		});
		
		Thread thread5 = new Thread (new Runnable() {
			public void run() {
				for (int i = 1; i <=1000; i++) {
					cntr.increment();
				}
			}
		});
		
		/*starting the thread*/
		thread4.start();
		thread5.start();
		
		/*using join*/
		thread4.join();
		thread5.join();
		
		/*displayin the count*/
		System.out.println(cntr.count);
	}

}
