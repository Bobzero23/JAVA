package set;

/*This class extends the set interface to support the set operation in math
 * does not accpet duplicates and does not maintain the order*/

/*must imports*/
import java.util.*;

/*mian class*/
public class Hashset {

	/*main method*/
	public static void main(String[] args) {

		/*creating object of the hashset*/
		Set<String> cities = new HashSet<>();
		
		/*adding some elements into it*/
		cities.add("Paris");
		cities.add("Konya");
		cities.add("NYC");
		cities.add("Toronto");
		cities.add("Dar es salaam");
		cities.add("London");
		
		/*displaying the hashset*/
		System.out.println(cities);
		
	}

}
