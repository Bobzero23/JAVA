package methods;

public class Mehtod {
	// method is a block of code executed whenever it is called.
	// do not create a method inside a main method hhhh.
	// you call a method inside a main method.
	
	static String Name = "Bobzero";
	static int Age = 21; 
	

	public static void main(String[] args) {
		Hello(Name,Age);
	}
	//you gonna have to pass parameters depends on what you are calling in main method
	//nahisi kwenye parameter za void unaandika data type yote kama ilivyo
	static void Hello(String Str, Integer Int) {
		System.out.println("Hello " +Str+ "!");
		System.out.println("You are " +Age+ " aren't you?");
	}
}
