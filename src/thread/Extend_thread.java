package thread;

/*main class must extend thread class*/
public class Extend_thread extends Thread{

	/*creating a run methods which says something*/
	public void run() {
		System.out.println("Thread started running...");
	}
	
	public static void main(String[] args) {
		
		/*creating object of the class*/
		Extend_thread object = new Extend_thread();
		
		/*calling the run method using the object of the class*/
		object.run();
	}

}
