package set;

/*in this class we gonna do some of mathematical set operations i.e intersection, union and difference*/

/*must import*/
import java.util.*;

/*main class*/
public class Set_operations {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating the first set and initializing the first array*/
		Set<Integer> set1 = new HashSet<>();
		set1.addAll(Arrays.asList(new Integer[] {7, 3, 6, 2, 4, 8, 9}));
		
		/*creating the second set and initializing the second array*/
		Set<Integer> set2 = new HashSet<>();
		set2.addAll(Arrays.asList(new Integer[] {1, 3, 5, 6, 7, 0}));
		
		/*creating the set which will perform the union operation and displaying*/
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println(union);
		
		/*creating the set which will perform the intersection operation and displaying*/
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		/*creating the third set which will perform the difference operation and displaying*/
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
	}

}
