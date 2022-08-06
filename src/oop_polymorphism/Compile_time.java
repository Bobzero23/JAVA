package oop_polymorphism;

/*this is an example of compile time polymorphism*/

/*main class*/
public class Compile_time {

	/*method 1 for multiplication*/
	static int multiply(int a, int b) {
		return a * b;
	}
	
	/*method 2 for addition*/
	static double addition(double a, double b) {
		return a + b;
	}
	
	
	/*main method*/
	public static void main(String[] args) {

		/*now callign the methods and displaying*/
		System.out.println(Compile_time.multiply(4, 6));
		System.out.println(Compile_time.addition(4.6, 2.4));
	}

}
