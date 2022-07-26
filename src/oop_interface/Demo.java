package oop_interface;

/*UNAJUA JAVA HAISUPPORT MUTLIPLE INHERITANCE ILA KWA KUTUMIA INTERFACE UNAWEZA FANYA
 * KITU KAMA HIKO PIA INTERFACE INAKUWA NA ABSTRACT METHODS ONLY
 * SUBCLASSS ZAKE ZINATUMIA implements KEYWORD*/
  
/*BUT EVERYTHING IS SAME AS SUBSTRCT*/
/*NORMALLY YOU CANT CREATE AN OBJECT OF INTERFACE AS IN SUBSTRACT CLASS
 * BUT YOU CAN DO IT IF YOU HAVE ANONYMOUS CLASS LIKE THIS*/

/*interface example*/
interface Parent{
	
	/*interface method*/
	void method1();
}

/*main class*/
public class Demo {

	/*main method*/
	public static void main(String[] args) {

		/*creating an object of inteface using anonymous class*/
		Parent object = new Parent() {
			public void method1(){
				System.out.println("Damn yeah I am anonymous class");
				
			}
		};
		object.method1();
	}

}
