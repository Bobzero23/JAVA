package classes;
// Java Program to Illustrate Static Nested Classes

// Importing required classes
import java.util.*;

@SuppressWarnings("unused")
// Class 1
// Outer class
class GFG1 {

	// Method
	private static void outerMethod()
	{

		// Print statement
		System.out.println("inside outerMethod");
	}

	// Class 2
	// Static inner class
	static class Inner {

		public static void display()
		{

			// Print statement
			System.out.println("inside inner class Method");

			// Calling method inside main() method
			outerMethod();
		}
	}
}

// Class 3
// Main class
class Static_nested_class {

	// Main driver method
	//This thing here is for avoiding some errors
	@SuppressWarnings("static-access")
	public static void main(String args[])
	{

		GFG1.Inner obj = new GFG1.Inner();

		// Calling method via above instance created
		obj.display();
	}
}
