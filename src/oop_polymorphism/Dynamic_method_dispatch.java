package oop_polymorphism;

/*TO USE THIS METHOD MUST BE OVERRIDED*/


/*First exmaple class*/
class A{
	public void show() {
		System.out.println("Inside A");
	}
}

/*Secodn exmaple class*/
class B extends A{
	public void show() {
		System.out.println("Inside B");
	}	
}

/*Third example class*/
class C extends A{
	public void show() {
		System.out.println("Inside C");
	}	
}

/*main class*/
public class Dynamic_method_dispatch {

	/*main method*/
	public static void main(String[] args) {

		/*this is how we use dynamic mehtod dispatch*/
		/*creating objects for class and calling the show method*/
		
		A object = new A();
		object.show();
		
		object = new B();
		object.show();
		
		object = new C();
		object.show();
		
		
	}

}
