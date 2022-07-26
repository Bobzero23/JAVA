package classes;
/*Class.forName method inpoitwa inakua ina run static method of the class
 * kawaida unapotengeneza object ya class inakuwa ina run static method 
 * and also howa ina run na instance blocks*/

/*main class*/
public class Class_forName {

	public static void main(String[] args) throws Exception {
	
		/*creating a class object*/
		/*this will run both static and instance blocks*/
		//Kid object = new Kid();

		/*giving a blank space*/
		//System.out.println("\n");
		
		/*here we used class.forName*/
		/*this will call only static*/
		Class.forName("Kid");
		
	}

}

/*example class for demonstration*/
class Kid {
	
	/*this is a static mehtod*/
	static {
		System.out.println("in static");
	}
	
	/*this is instance blocks*/
	{
		System.out.println("in instance");
	}
}
