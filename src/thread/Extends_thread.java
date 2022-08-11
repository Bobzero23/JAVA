package thread;

/*main class must extend thread class*/
public class Extends_thread extends Thread{

	/*creating a run methods which says something*/
	public void run() {
		System.out.println("Thread started running...");
	}
	
	public static void main(String[] args) {
		
		/*creating object of the class*/
		Extends_thread object = new Extends_thread();
		
		/*calling the run method using the object of the class*/
		object.run();
	}

}
