package string;

//strings are immutable but by using string buffer or string builder we can make them mutable
//always prefer string buffer coz it is thread free

public class Stringbuffer {

	public static void main(String[] args) {
		
		//to use string buffer we need to create object on StringBuffer Class
		//is not neccessary to pass the string right away
		StringBuffer name = new StringBuffer("Britney");
		
		//this method will add a string to our string
		name.append(" Kibonge");
		//this method will replace any characters we want
		name.replace(8, 15, "Mhando");
		//this method will delete anything we want
		name.delete(8,14);
		
		System.out.println(name);
		
	}

}
