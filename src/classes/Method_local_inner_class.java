package classes;
// Java Program to Illustrate Inner class can be
// declared within a method of outer class

// Class 1
// Outer class
class Method_local_inner_class {

	// Method inside outer class
	void outerMethod()
	{

		// Print statement
		System.out.println("inside outerMethod");

		// Class 2
		// Inner class
		// It is local to outerMethod()
		class Inner {

			// Method defined inside inner class
			void innerMethod()
			{

				// Print statement whenever inner class is
				// called
				System.out.println("inside innerMethod");
			}
		}

		// Creating object of inner class
		Inner y = new Inner();

		// Calling over method defined inside it
		y.innerMethod();
	}
}

// Class 3
// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of outer class inside main()
		// method
		Method_local_inner_class x = new Method_local_inner_class();

		// Calling over the same method
		// as we did for inner class above
		x.outerMethod();
	}
}
