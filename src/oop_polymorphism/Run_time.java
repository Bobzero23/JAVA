package oop_polymorphism;

/*parent class*/
public class Run_time {

	/*method to be overided*/
	public void run() {
		System.out.println("parent class");
	}
	
	/*mian method*/
	public static void main(String[] args) {

		/*creating the object for the parent class*/
		Run_time object = new Run_time();
		object.run();
		
		/* calling the run method in chidl1 class*/
		object = new Child1();
		object.run();
		
		/* calling the run method in chidl2 class*/
		object = new Child2();
		object.run();
		
		
	}

}

/*the first child clas*/
class Child1 extends Run_time{
	
	/*here we override the method*/
	public void run() {
		System.out.println("The first child");
	}
}


/*the first child clas*/
class Child2 extends Run_time{
	
	/*here we override the method*/
	public void run() {
		System.out.println("The second child");
	}
}