package exception_handling;
/*TRY/CATCH AND FINALLY BLOCKS ARE USED TO HANDLE SOME LOGICAL AND COMPILE ERRORS*/



public class Try_catch_finally {

	public static void main(String[] args) {

		/*try block*/
		try {
			/*initializing variables*/
			int x = 4;
			int y = 0;
			int sum;
			
			/*calculaiton*/
			sum = (x/y);
			
			/*displaying sum*/
			System.out.println(sum);
			
			/*as you know normally we cant divide a number by zero it is an error*/
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		/*this block will be executed no matter what*/
		finally {
			System.out.println("The end");
		}
		
	}

}
