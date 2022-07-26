package static_keyword;

public class Friends_main {

	public static void main(String[] args) {
		
		//after creating these friends then we will have some number of friends 
		Friends friend1 = new Friends("Bobzero");
		//lets create a second friend 
		Friends friend2 = new Friends("TheProblem");

		//so here the static variable is being shared to another static class
		System.out.println(Friends.NumberOfFriends);
		//if you just print like this it will display zero coz we dont have any friends yet
		//until we make some friends
		
		//here lets call a static method we created
		//to call it we use the class name and method
		Friends.DisplayFriends();
		
		// displaying which friend
		System.out.println("My first friend is " +friend1.Name);
		System.out.println("My first friend is " +friend2.Name);
	}

}
