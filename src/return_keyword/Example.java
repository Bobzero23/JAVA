package return_keyword;
/*The only difference between RETURN and BREAK is you can use RETURN out the out and inside the loop
 * but you can only use BREAK inside the loop */

//this is my class
public class Example {
	// this is my main method
	public static void main(String[] args) {
		
		//intiating a variable 
		int i = 1;
		System.out.println(i);
		i++;
		if(i == 1) {
			//break; here you cant use break coz there aint no loop 
			return; //but we can use return 
		}

	}

}
