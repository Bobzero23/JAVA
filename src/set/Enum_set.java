package set;

/*imports*/
import java.util.*;

/*main class*/
public class Enum_set {

	/*creating Enum in a list form*/
	enum DAY {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
	
	/*main method*/
	public static void main(String[] args) {

		/*declaring object of Set interface with object type of the enum we created*/
		Set<DAY> day;
		
		/*initializing the object with the enums*/
		day = EnumSet.of(DAY.MONDAY, DAY.TUESDAY, DAY.WEDNESDAY, DAY.THURSDAY, DAY.FRIDAY, DAY.SATURDAY, DAY.SUNDAY);
		
		/*displaying the set*/
		System.out.println("This is our Enum set: " + day); 
		
	}

}
