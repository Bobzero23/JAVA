package super_keyword;
/*super keyword inatumika kutoa confusion wakati unatumia superclass na subclass*/
/** every consturctor has a super method by default*/
/*by passing the parameter to our super method we decide which constructor to call*/

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
