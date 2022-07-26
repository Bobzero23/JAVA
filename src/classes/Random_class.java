package classes;
//we need to import this class to use random
import java.util.Random;

//this is my class
public class Random_class {
	
	//this is my main method
	public static void main(String[] args) {
		
		//Initiating an object for random
		Random random = new Random();
		
		//generating random integer from 0-10
		//displaying the result
		System.out.println(random.nextInt(7));

	}

}
