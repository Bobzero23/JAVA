package reflection;

/* Reflection can be used to get information about class, constructors, and methods

 * Through reflection, we can access the private variables and methods of a class 
 * with the help of its class object and invoke the method*/

/*must imports reflect*/
import java.lang.reflect.*;

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
		System.out.println("The string is: " + name);
	}
	
	/*creating a method that takes a value as parameter and display the value inside the method*/
	public void method2(int n) {
		System.out.println("The rapper name is " + n + " Cent");
	}
	
	/*creating a private method which prints anything*/
	public void method3() {
		System.out.println("From the private method");
	}
}


/*main class*/
public class Demo {

	/*main deriver class*/
	public static void main(String[] args) throws Exception {

		/*creating the object of the test class*/
		Test test_object = new Test();
		
		/*creating object of the Class class with the object of test class and getClass */
		/*I guess after this we be connecting the test class with this object*/
		Class class_object = test_object.getClass();
		
		/*using the the object we created to print the name using getName*/
		System.out.println("The name of the class is: " + class_object.getName());
		
		/*creating the object of the Constructor with the objcet of 
		 * the class and getConstructor and this one throws expecton*/
		Constructor constructor_object = class_object.getConstructor();
		
		/*print the name of the constructor using the object we created with getName*/
		System.out.println("The name of the constructor is: " + constructor_object.getName());
		
		/*just display the message saying THE PUBLIC METHODS ARE*/
		System.out.println("\nTHE PUBLIC METHODS ARE:");
		
		/*creating the Method array to get the methods using class object and getMethods*/
		/*seems like this API is always an array*/
		Method[] methods = class_object.getMethods();
		
		/*now we print the methods using enhanced for loop and using getName*/
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		/*after getting names we create an object for our desired method with object
		 * of the class and getDeclaredMethod then we pass the name 
		 * of the object in as string form and int.class I still dont know why tho*/
		Method method_call1 = class_object.getDeclaredMethod("method2",int.class);
		
		/*invoking a method using object of our desired we created and invoke() mehtod
		 * then we pass in object of the class where method is belonging to  and 
		 * pass null if the method has no parameters*/
		method_call1.invoke(test_object, 50);
		
		/* creating an object of our desired field using object of the class with 
		 * getDeclaredField and then we pass in the name of the field as string */
		Field field_object = class_object.getDeclaredField("name");
		
		/*setting the field accessible usign object and setAccessible boolean method*/
		/*this method will set the field accessbie even tho it was private */
		field_object.setAccessible(true);
		
		/*now that our field is accessible we assigning the new value to it 
		 *  using set method and pass in test class object with what we wanna assign*/
		field_object.set(test_object, " Bobzero");
		
		/*again creating object of method and passing in the name of the object 
		 * using class object and getDeclaredMehtod method*/
		Method method_call2 = class_object.getDeclaredMethod("method1");

		/*we invoke the the method using the object we just created now 
		 *  and pass in the object of the class where the method came from as a parameter*/
		method_call2.invoke(test_object);
		
		/*again creating object of method and passing in the name of the object 
		 * using the object of the CLASS and getDeclaredMehtod method*/
		Method method_call3 = class_object.getDeclaredMethod("method3");
		
		/*since this mehtod was private we set it accessible*/
		method_call3.setAccessible(true);

		/*invokign the private method*/
		method_call3.invoke(test_object);
	
	}

}
