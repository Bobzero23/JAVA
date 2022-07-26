package colection_and_generics;
/*LIST HAS INDEX AND ALSO TAKES INPUT AS OBJECT*/

/*needed imports*/
import java.util.*;

/*main class*/
public class List_demo {

	/*mian method*/ /*suppressing some warnings*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		/*creaitng a list interface*/
		List values1 = new ArrayList();
		
		/*adding some values*/
		values1.add(3);
		values1.add(5);
		values1.add(9);
		values1.add(6);
		values1.add("Number");

		/*displaying values*/
		/*using enhanced for loop*/
		for(Object obj: values1) {
			System.out.println(obj);
		}
		
		
	}

}
