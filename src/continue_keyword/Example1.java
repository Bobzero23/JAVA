package continue_keyword;
/*Displayin numbers from 1-10 by skipping the even numbers using CONTINUE keyword*/

//the class
public class Example1 {
	//main method
	public static void main(String[] args) {
		//for statement to count one to ten
		for(int i = 1; i <= 10; i++) {
			if(i%2==0) {//if the number is even 
				continue;// skip the number 
			}
			//displaying the result
			System.out.println(i);
		}
	}

}
