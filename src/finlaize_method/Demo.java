package finlaize_method;

/*This is called to dispose of System resource, to clean up activities and minimize memory leaks
 * in this code you will see that this method is called right after the garbage collection is done*/

/*main class*/ 
public class Demo {

	/*main driver method*/
	public static void main(String[] args) throws Exception {

		/*creating object of the Demo class*/
		Demo demo_object = new Demo();
		
		/*nullifying the object*/
		demo_object = null;
		
		/*calling the garbabe collector*/
		System.gc();
		
		/*printing something after garbage collection*/
		System.out.println("After garbage collection");
		
		/*calling the finalize method*/
		
	}

	/*overriding the finalize mehtod*/
	@Override
	protected void finalize() {
		System.out.println("Finalized method called..");
	}
	
}
