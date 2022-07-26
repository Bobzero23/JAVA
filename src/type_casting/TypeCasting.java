package type_casting;
/********THIS CODE IS FOR TYPE CASTING ********/
// THERE ARE TWO TYPES OF TYPE CASTING 
//1. WIDENING CASTING (LOW TO HIGH) byte>short>char>int>long>float>double
//2. NARROWING CASTING (HIGH TO ROW) double>float>long>int>char>short>byte

public class TypeCasting {

	public static void main(String[] args) {
		
		/****WIDENING CASTING****/
		int MyInt1 = 5; // my first integer assignment
		double MyDouble1 = MyInt1; // casting my integer into double
		
		System.out.println(MyInt1);  // displaying my first integer after casting
		System.out.println(MyDouble1); // displaying my first double after casting
		
		System.out.println("\n"); // just for putting some space between codes 
	
	    
		/*****NARROWING CASTING****/
		double MyDouble2 = 10;  // my second double assignment
		int MyInt2 = (int) MyDouble2; // casting my double into integer
		System.out.println(MyDouble2); // displaying my second double before casting
		System.out.println(MyInt2);  // displaying my integer after casting 
	}

}
