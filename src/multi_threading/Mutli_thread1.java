package multi_threading;
/*THIS CODE WILL MAKE TWO METHODS RUN AT THE SAME TIME*/
/*THE METHOD NAME HAS TO BE RUN ON BOTH METHOD*/
/*WHILE CALLING THE METHOD WE USE start AFTER THE OBJECT*/

/*demo class 1*/
class Hi1 extends Thread{
	
	/*this method will display hi 5 times*/
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("HI");
			
			/*here lets use thread and see how it works*/
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

/*demo class 2*/
class Hello1 extends Thread{
	

	/*this method will display HELLO 5 times*/
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("HELLO");
			
			/*here lets use thread and see how it works*/
			try {Thread.sleep(500);}catch(Exception e) {}
			
		}
	}
}


/*main class*/
public class Mutli_thread1 {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating objects*/
		Thread object1 = new Hi1();
		Thread object2 = new Hello1();
		
		/*calling a method*/
		object1.start();
		
		/*to make time between these two*/
		try {Thread.sleep(10);}catch(Exception e) {}
		
		/*calling a method*/
		object2.start();
		

	}

}
