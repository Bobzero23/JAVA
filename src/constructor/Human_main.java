package constructor;

//this is my main class 
public class Human_main {
	

	public static void main(String[] args) {

		//here we initiating a human object with all needed parameters
		Human human1 = new Human("Bobzero", 21, 65);
		Human human2 = new Human("Dr.Love", 21, 64);
		Human human3 = new Human("Theproblem", 21, 60);
		
		//now here I called the object name of a Human constructor
		System.out.println(human1.name);

		//here we call a method using our constructor object 
		human2.eat();
		
		//here we call the drinking method with our constructor object
		human3.drink();
		
	}

}
