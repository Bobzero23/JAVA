package classes;
/*MARA NYINIG HUTUMIKA NDANI YA MAIN METHOD KAMA UNATAKA PALE UNAPOTAKA KUCALL 
 * METHOD YA CLASS AMBAYO UMECREATE ILA UNATAKA IFANYE KAZI NYENGINE*/

//practice


/*main class*/
public class Anonymous_class {

		/*example method*/
	public void play() {
		System.out.println("I know you're somewhere out theeee...");
	}
	
	
	/*main mehtod*/
	public static void main(String[] args) {
		
		/*creating an object of a class*/
		Anonymous_class object = new Anonymous_class()
				
		/*here we create our anonymous class*/
				{
						public void play() {
							System.out.println("some where far awaaaaay..");
						}
				};
				
				/*this will display our anonymous class' mehtod*/
				object.play();
	}

}
