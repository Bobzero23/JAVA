package multi_threading;
/* A thread in Java is the direction or path that is taken while a program is being executed*/
/*ironically it also need a throw to be thrown or try catch*/

/*demo class 1*/
class Hi{
	
	/*this method will display hi 5 times*/
	public void hi() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("HI");
			
			/*here lets use thread and see how it works*/
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

/*demo class 2*/
class Hello{
	

	/*this method will display HELLO 5 times*/
	public void hello() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("HELLO");
			

			
		}
	}
}

/*mian class*/
public class Demo {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating objects*/
		Hi object1 = new Hi();
		Hello object2 = new Hello();
		
		/*calling the methods*/
		object1.hi();
		
		/*just for making space*/
		System.out.println();
		
		/*calling the methods*/
		object2.hello();
		
		
		
		
	}
}
