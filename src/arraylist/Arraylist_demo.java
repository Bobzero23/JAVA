package arraylist;

/*It is resizable array, this one is also one of class of collection*/

/*must imports*/
import java.util.*;

/*main class*/
public class Arraylist_demo {

	/*main derived class*/
	public static void main(String[] args) {

		/*creating arraylist*/
		ArrayList<String> bag = new ArrayList<>();
		
		/*adding some objects with index*/
		bag.add(0, "Pen");
		bag.add(1, "Book");
		bag.add(2, "Pencil");
		bag.add(3, "Eraser");
		bag.add(4, "Gum");
		
		
		/*displaying the arraylist*/
		System.out.println(bag);
		
		/*clearing all elements of arraylist*/
		bag.clear();
		
		/*displaying the arraylist*/
		System.out.println(bag);
		
		/*checking if the arraylist is empty or not*/
		System.out.println(bag.isEmpty());
		
		/*adding some objects without using index*/
		bag.add("Pen");
		bag.add("Book");
		bag.add("Pencil");
		bag.add("Eraser");
		bag.add("Gum");
		
		
		/*displaying the arraylist*/
		System.out.println(bag);
		
		/*checking if the arraylist contains a particular object*/
		System.out.println(bag.contains("Dog"));
		
		/*getting a particular object from arraylist using its index*/
		System.out.println(bag.get(4));
		
		/*removing a particular object from the arraylist*/
		bag.remove("Gum");
		
		/*displaying the arraylist*/
		System.out.println(bag);
		
		/*replacing a particular object with another particular object in the arraylist*/
		bag.set(3, "Chocolate");
		
		/*displaying the arraylist*/
		System.out.println(bag);
		
		/*displaying the size of the arraylist*/
		System.out.println(bag.size());
		
	}

}
