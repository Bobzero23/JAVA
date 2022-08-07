package reflection;

/* Reflection can be used to get information about class, constructors, and methods

 * Through reflection, we can access the private variables and methods of a class 
 * with the help of its class object and invoke the method*/

/*must imports reflect*/

/*test class*/
class Test{
	
	/*creating a private field*/
	private String name;
	/*creating a constructor*/
	public Test() {
		
		/*initializing a value of the field inside the constructor*/
		name = "My name is";
	}

	/*creating a method that will print the value of the field*/
	public void method1() {
		System.out.println(name);
	}
	
	/*creating a method that takes a value as parameter and display the value inside the method*/
	public void method2(int n) {
		System.out.println(n);
	}
	
	/*creating a private method which prints anything*/
	public void mehtod3() {
		System.out.println("From the private method");
	}
}


/*main class*/
public class Demo {

	/*main deriver class*/
	public static void main(String[] args) {

		/*creating the object of the test class*/
		/*creating object of the Class with the getClass constructor*/
		/*using the the object we created to print the name using getName*/
		/*creating the object of the Constructor withthe  getConstructor constructor*/
		/*print the name of the constructor using the object we created with getName*/
		/*just display the message saying THE PUBLIC METHODS ARE*/
		/*creating the array of the method giving it a name and getMethods constructor*/
		/*now we print the methods using enhanced for loop and using getName*/
		/*after getting names we create an object for our desired method and = object
		 * of the class and getDeclaredMethod then we pass the name 
		 * of the object in as string form and int.class*/
		/*invoking a method using object of our desired we created and invoke() mehtod
		 * then we pass in object of the class where method is belonging to  and 
		 * pass null if the method has no parameters*/
		/*creating an object of our desired field and = object of the class with 
		 * getDeclaredField and then we pass in the name of the field as string*/
		/*setting the field accessible usign object and setAccessible boolean method*/
		/*this method will set the field accessbie even tho it was private */
		/*not that our field is accessible we concatnate it with another string using set method*/
		/*again creating object of method and passing in the name of the object 
		 * using the object of the CLASS and getDeclaredMehtod method*/
		/*we ivoke the the method using the object we just created now using the object of the class*/
		/*again creating object of method and passing in the name of the object 
		 * using the object of the CLASS and getDeclaredMehtod method*/
		/*since this mehtod was private we set it accessible first then we invoke it*/
		
	}

}
