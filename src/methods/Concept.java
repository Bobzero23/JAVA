package methods;

/*HERE WE WILL CALL A METHOD OF FIRST CLASS INSIDE A METHOD OF A SECOND CLASS*/

/*first class for example*/
class First{
	
	/*example method*/
	public void method1() {
		System.out.println("Inside method one");
	}
}

/*first class for example*/
class Second{
	
	/*this is how you do it*/
	/*here call is the object of first class*/
	public void method2(First call) {
		call.method1();
		
	}
}


/*main class*/
public class Concept {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating object for second class*/
		Second object = new Second();
		
		/*creating object for first class*/
		First call = new First();

		/*calling seconds class method*/
		object.method2(call);;
	}

}
