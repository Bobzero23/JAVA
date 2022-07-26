package constructor;

/*main class*/
public class Consturctor_overloading {

	/*declaring some variables*/
	int a;
	int b;
	int c;

	/*creating our first constructor*/
	@SuppressWarnings("unused")
	public Consturctor_overloading() {
		
		/*initializing the values*/
		int a = 100;
		int b = 200;
		int c = 300;
	
		/*displaying which constructor is executed*/
		System.out.println("From the first constructor ");
	}
	
	/*creating the second constructor*/
	@SuppressWarnings("unused")
	public Consturctor_overloading(int n) {
		
		/*initializing the values*/
		int a = n;
		int b = n;
		int c = n;
		
		/*displaying which constructor is executed*/
		System.out.println("From the second constructor ");
		
	}
	
	/*creating the third constructor*/
	@SuppressWarnings("unused")
	public Consturctor_overloading(String x, int y) {
		
		/*initializing the values*/
		int a = y;
		int b = y;
		String c = x;
		
		/*displaying which constructor is executed*/
		System.out.println("From the third constructor ");
	}
	
	public static void main(String[] args) {
		
		/*creating an object of our class*/
		
//		/*this will display from the first constructor*/
//		Consturctor_overloading object = new Consturctor_overloading();
		
		/*this will display from the second constructor*/
		Consturctor_overloading object = new Consturctor_overloading(7);
		System.out.println(object.a);
		
//		/*this will display from the third constructor*/
//		Consturctor_overloading object = new Consturctor_overloading();
	}

}
