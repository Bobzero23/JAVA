package oop_interface;

/*SO FAR WE KNOW THAT INSIDE AN INTERFACE WE CAN ONLY CREATE AN ABSTRACT METHOD WHICH HAS NO BODY
 * ASLO WE CAN CREATE A DEFAULT METHODS LIMITLESSLY WITH BODIES AND ALSO WE CAN CREATE STATIC METHODS*/

/*STATIC METHODS HELP US TO CALL A METHOD WITHOUT CRETING A REFERENCE TO A PARTICULAR INTERFACE*/
/*alos we shall know that every variable in interface is a constant even if you dont say it*/


/*example interface*/
interface Round{

	/*here is the static method*/
	public static void method() {
		System.out.println("Yeah we did it..");
	}
}


public class Static_method {

	public static void main(String[] args) {
		 
		/*calling the static method*/
		Round.method();
	}

}
