package var_args;
/*VARARGS IS LIKE GIVING AN ARRAY TO A METHOD AS A PARAMETER SO U CAN ACCESS
 * AS MUCH AS PARAMETER WHEN YOU CALL THE METHOD IN THE MAIN METHOD*/

/*main class*/
public class Var_args {
	
	/*sum variable we gonna use for adding*/
	 int sum;


	/*varargs method for addition*/
	public int  add(int ... i) {
		for( int x : i) {
			sum = sum + x;
		}
		return sum;
	}
	
	/*main method*/
	public static void main(String[] args) {
		
		/*creating an object for the class*/
		Var_args object = new Var_args();
		
		
		/*displaying the result*/
		System.out.println(object.add(4,5,1));
	}

}
