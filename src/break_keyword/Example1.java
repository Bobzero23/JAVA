package break_keyword;
/*using  BREAK keyword we will display the numbers less than 51 among 100 numbers*/

//this is my class
public class Example1 {
	//this is my main method
	public static void main(String[] args) {

		//this is for loop for numbers from 1 to 100
		for(int i = 1; i <= 100; i++) {
			if(i > 50) {// checks if the number is greater than 50
				break; // then will break
			}
			//displaying the results
			System.out.println(i);
		}

	}

}
