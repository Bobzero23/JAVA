package exception_handling;
/*HERE WE GONNA LEARN HOW TO USE TRY BLOCK WITHOUT CATCH OR FINALLY BLOCK*/

/*REOURCE ALWAYS COMING WITH IO CLASS*/
import java.io.*;

public class Try_with_resource {

	
	/*when we gonna use resources we have to throw exception*/
	public static void main(String[] args) throws Exception  {
		
		/*asking user for input*/
		System.out.println("Enter a number: ");
		
		/*this is how we can use try block without any cath or finally*/
		/*we have to create a resource object inside a try parameters*/
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int n = Integer.parseInt(br.readLine());
			System.out.println(n);
		}
		
	}

}
