package colection_and_generics;
/*GENERICS ZINATUMIKA KUSPECIFY KUWA TUNATUMIA DATA TYPE IPI*/
/*WE WILL ALSO SEE SOME METHODS*/

/*needed imports*/
import java.util.*;

/*main class*/
public class Generics {

	/*main method*/
	public static void main(String[] args) {

		/*creating a list with generics*/
		List<Integer> values2 = new ArrayList<>();
		
		/*adding some values*/
		values2.add(359);
		values2.add(576);
		values2.add(938);
		values2.add(614);
		
		/*we can sort the list*/
		//Collections.sort(values2);	
		
		/*we can reverse the list*/
		//Collections.reverse(values2);
		
		/*we can sort according to the last digit
		 * just by using comparator class */
		
		/*creating a comparator object*/
		/*we could also use lambda expression but thats a drag*/
		Comparator<Integer> c = new Comparator<Integer> () {
		public int compare(Integer i, Integer  j) {
			if (i % 10 > j % 10) {
				return 1;
			}else {
				return -1;
			}
		}
	};
	
	/*sorting the list using comparator*/
	Collections.sort(values2, c);
		
		/*displaying the list*/
		for(Integer i : values2) {
			System.out.println(i);
		}
		
		
	}

}
