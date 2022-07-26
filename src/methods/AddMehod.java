package methods;

public class AddMehod {
	
	//they always have to be static smh
	static int x = 10;
	static int y = 40;

	public static void main(String[] args) {
		
		//I still dont get it why we have to call it this way
		System.out.println(Add(x,y));
	}

	//here is my method for adding 
	static int Add(int x, int y){ 
		return x + y; // it will return the sum 
	}
}
