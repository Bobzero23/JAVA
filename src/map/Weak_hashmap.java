package map;

/*This class is just like normal hashmap but this one is thread-safe
 * if you run the same with hashmap class the output will be different*/

/*must import*/
import java.util.*;

/*creating a Demo class*/
class Demo{

	/*creating a to string method which returns demo*/
	public String toString() {
		return "My name is ";
	}
	
	/*overriding the finalize method which displays something*/
	@Override
	protected void finalize() {
		System.out.println("Finalize method called, so shut up");
	}

}

/*main class*/
public class Weak_hashmap {

	/*main method*/ /*thread throws exception*/
	public static void main(String[] args) throws Exception{

		/*creating object of weak hashmap without generics*/
		Map map = new WeakHashMap();
		
		/*creating of object of the Demo class*/
		Demo demo_object = new Demo();
		
		/*putting Demo object into the map and giving it a value*/
		/*this one will call to string method in the Demo class*/
		map.put(demo_object, " Slim Shady");
		
		/*displaying the map*/
		System.out.println(map);
		
		/*nullifying the object of main class*/
		demo_object = null;
		
		/*calling the garbage collection to collect the null object*/
		System.gc();
		
		/*we let it wait for 1s so it finish collectin properly*/
		Thread.sleep(1000);
		
		/*again displaying the map but this time won't display
		 * anything because the object we used is null now*/
		System.out.println(map);
		
	}

}
