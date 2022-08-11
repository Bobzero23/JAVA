package thread;

/*main class implements runnable interface*/
public class Implements_runnable implements Runnable {

	/*overriding the run method*/
	@Override
	public void run() {
		System.out.println("Thread is running smoothly...");		
	}

	/*main derived method*/
	public static void main(String[] args) {

		/*creaing the object of the class*/
		Implements_runnable class_object = new Implements_runnable();
		
		/*initializing thread object with the main class object*/
		Thread thread_object = new Thread(class_object);
		
		/*calling the run method using thread object*/
		thread_object.run();
	}

}
