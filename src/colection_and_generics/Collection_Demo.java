package colection_and_generics;
/*WE WILL SEE HOW TO USE COLLECTION ALONG WITH ITERATOR*/
/*SINCE THAT COLLECTIO DOESNT WORK WITH INDEX IS HARD TO PRINT ONE BY ONE
 * THATS WHY WE GONNA HAVE TO USE ITERATOR 
 * NOTE
 * Iterator is a class and iterator is a method*/



/*needed imports*/
import java.util.*;

/*main class*/
public class Collection_Demo {

	/*main method*/ /*suppressing some waringings*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		/*lets create a collection object here*/
		Collection values = new ArrayList();
		
		/*adding some values*/
		values.add(4);
		values.add(9);
		values.add(3);
		values.add(5);
		
		/*displaying the collection*/
		System.out.println(values);
		
		/*now to display one by one we use iterator*/
		/*creating the iterator and passing the values*/
		Iterator  it = values.iterator();
		
		/*for space purpose*/
		System.out.println("\n");
		
		
		/*now to display them all*/
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
