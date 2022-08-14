package set;

/*This class arrange the elements according to their natural order, I mean abcdefgh..*/

/*imports*/
import java.util.*;

/*main class*/
public class Tree_set {
	
	/*main method*/
	public static void main(String[] args) {

		/*creating the object of TreeSet*/
		Set<String> alphabet = new TreeSet<>();
		
		/*adding some elements into it*/
		alphabet.add("G");
		alphabet.add("C");
		alphabet.add("E");
		alphabet.add("B");
		alphabet.add("F");
		alphabet.add("D");
		alphabet.add("A");
		
		/*displaying the tree set*/
		System.out.println(alphabet);
		
	}

}
