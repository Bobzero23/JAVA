package oop_interface;

/*THER ARE THREE TYPES OF INTERFACES
 * ++ NORMAL - has more than one mthods
 * ++ SINGLE ABSTRACT METHOD - JAVA_8.FUNCTIONAL INTERFACE - LAMBDA EXPRESSIO - has only one method
 * ++ MARKER INTERFACE - has no method at all*/


            /*THIS IS AN EXAMPLE OF JAVA_8.FUNCTIONAL INTERFACE*/
				/*AND WE WILL SEE LAMBDA EXPRESSION*/

/*here is the interface*/
/*you can also use this anotation*/
@FunctionalInterface
interface Example{
	void say();
}

/*main class*/
public class Types {

		/*main method*/
	public static void main(String[] args) {
		
		/*this is how we use lambda expression*/
		Example object = () -> {
			System.out.println("I want to go");
			};
			
		/*calling the object*/
		object.say();
	}

}
