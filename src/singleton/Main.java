package singleton;

/**singleton class is a class that can have only one object (an instance of the class) at a time.
 * After the first time, if we try to instantiate the Singleton class, 
 * the new variable also points to the first instance created.*/

/*The instance must be PRIVATE STATIC and is better to initialize it as nulland the constructor must
 *  be PRIVATE and  there must a PUBLIC STATIC method to return the instanec created*/


/*Signleton class*/
class Singleton{
	
	/*creating a singleton instance*/
	private static Singleton instance = null;
	
	/*normal variable*/
	String s;

	private Singleton() {
		s = "I am part of singleton"; 
	}
	
	/*method that will initialize and return the instance*/
	public static Singleton getInstance() {
		
		/*checking conditions*/
		if(instance == null) 
			instance = new Singleton();
			return instance;
		
	}
}

/*main class*/
public class Main {

	/*main driver method*/
	public static void main(String[] args) {

		/*creating other instance of the singleton class*/
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
	
	
		/*displaying the output*/
		System.out.println("The hash code of x is: " + x.hashCode());
		System.out.println("The hash code of y is: " + y.hashCode());
		System.out.println("The hash code of z is: " + z.hashCode());
	
		/*confirming that the new instances we created are
		 * pointing the same direction of memory*/
		if( x == y && y == z) {
			System.out.println("These instance are pointing to the same memory");
		}else {
			System.out.println("These instance are not pointing to the same memory");
		}
		
	}

}
