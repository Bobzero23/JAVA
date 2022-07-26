package exception_handling;
/*IN THIS CODE WE GONNA SEE HOW TO WORK WITH MUTLIPLE CATCH BLOCKS*/

public class Multiple_catch {

	public static void main(String[] args) {
		
		/*try block*/
		try {
			
			/*arithmetic_2*/
			int arr[] =  new int[6];
			arr[7] = 8;
			System.out.println(arr[7]);
			
			/*arithmetic_1*/
			int x = 3;
			int y = 0;
			int sum = (x/y);
		
			
			/*displaying sum*/
		    System.out.println(sum);	
		
		 }
		
		/*this will catch both of these arithmetiac exceptions*/
		catch(ArrayIndexOutOfBoundsException  | ArithmeticException e){
			System.out.println(e);
		}

	}

}
