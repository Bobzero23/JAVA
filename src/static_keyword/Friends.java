package static_keyword;

// static = a single copy of variable/method is created and shared 
// created inside the class

public class Friends {
	
	String Name; // just a string variable
	 // this is my static variable which all classes are going to share 
	static int NumberOfFriends;

	//here is my constructor 
	Friends(String Name){
		this.Name = Name;
		
		//I dont know why we have to increment number of friends
		//seems like if we dont increment even if we create a friend wont count
		NumberOfFriends++;	
	}
	
	//lets create a static method now
	static void DisplayFriends() {
		System.out.println("I have " +NumberOfFriends+ " friends.");
	}
}
