package var_args;

/*MULITIPLYING NUMBERS USING VAR ARGS*/

/*main class*/
public class Var_args_multiplication {

	/*declaring a variable*/
	int mult = 1; 
	
	/*var args method for multiplication*/
	public int multiply(int...x) {
		for(int i : x) {		
			 mult = mult * i;
			
		}
		return mult;
	}
	
	/*main method*/
	public static void main(String[] args) {
		
		/*creating an object of a class*/
		Var_args_multiplication object = new Var_args_multiplication();
		
		/*displaying the results*/
		System.out.println(object.multiply(5, 5, 5));
		
		
		}
	
}
