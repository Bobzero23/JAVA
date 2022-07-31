package super_keyword;

/*SUPER KEYWORD --> It is used to call superclass methods, and to access the superclass constructor.
The most common use of the super keyword is to eliminate the confusion between
superclasses and subclasses that have methods with the same name.*/

/*First Example class*/
class Mother{
	
	/*constructors*/
	public Mother(){
		System.out.println("Mother's first Child");
	}
	
	public Mother(int i){
	System.out.println("Mothers second Child ");	
	}
}

/*second Example class*/
class Father extends Mother{
	
	/*constructors*/
	 public Father() {
		 System.out.println("Father's first child");
	 }
	 public Father(int i) {
		 /*here we use the super method and passing it a parameter*/
		 super(i);
		 System.out.println("Father's second child"); 
	 }
}

/*mian class*/
public class Super_keyword {

	/*main mehtod*/
	public static void main(String[] args) {
		
		/*creating mother object*/
		@SuppressWarnings("unused")
		Father father = new Father();
	
	}
}
