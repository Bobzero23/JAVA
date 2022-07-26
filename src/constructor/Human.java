package constructor;

// constructors are methods called when an object is insantiated
// they are created inside the class 
public class Human {
	
	//I really donno why I created this variables but whate the heck right
	String name;
	int age;
	double weight;

	//like saying to consturct a human we need to have this parameters
	Human(String name, int age, double weight){
		
		//here using "this" keyword is like using the object human in other file 
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	void eat() {
		System.out.println(this.name+ " is eating chips");
	}
	
	void drink() {
		System.out.println(this.name+ " is drinking Juice");
	}

}
