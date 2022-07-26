package oop_interface;

/*NORMALLY IN INTERFACE METHODS DONT HAVE BODIES BUT BY USING DEFAULT METHODS
 * WE CAN PUT BODY INSIDE AN INTERAFCE AND ALSO IT CAN BE OVERRIDED*/

/*NOTE: DEFAULT METHODS ARE ONLY ALLOWDED IN INTERFACES*/

/*example interface*/
interface Meh{
	
	/*abstract method*/
	void go();
	
	/*default method*/
	public default void come() {
		System.out.println(" I am coming back ");
	}
	
}

/*implementing class*/
class Implementor implements Meh {
	
	/*override the go method*/
	public void go() {
		System.out.println(" and way down we go go go..");
	}
	
	/*default method OVERRIDED*/
	public void come() {
		System.out.println(" I am coming back OR NEVERMIND");
	}
}

/*main class*/
public class Default_method {
	
	/*main method*/
	public static void main(String[] args) {

		/*creating an object*/
		Meh object = new Implementor();
		
		/*calling the methods*/
		object.go();
		
		object.come();
	}

}
