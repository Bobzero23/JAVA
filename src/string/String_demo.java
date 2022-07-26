package string;

public class String_demo {

	public static void main(String[] args) {
		
		// here is my string initiating
		String name = "Bobzero";
		
		//this boolean method will check whether they are equal or not
		boolean result1 = name.equals("TheProblem");
		//this method will return the length of a string
		int result2 = name.length();
		//this method will return a certain char belonging to what index we enter
		char result3 = name.charAt(0); //the first char is index zero (0)
		//this method will give us the position of the paticular
		int result4 = name.indexOf("B");
		//this method will tell us if the string is empty
		boolean result5 = name.isEmpty();
		//this method will make turn our string to uppercase
		String result6 = name.toUpperCase();
		//this method will make turn our string to lowercase
		String result7 = name.toLowerCase();
		//this method will trim all empty space in our string 
		//no need to run this method anyway my string dont have empty space
		String result8 = name.trim();
		//this method will replace the character
		//care full it will replace all the characters if they are dups
		String result9 = name.replace('o', 'a');
		
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result8);
		System.out.println(result7);
		System.out.println(result9);
	}

}
