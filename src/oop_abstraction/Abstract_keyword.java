package oop_abstraction;

/** UNAPOTUMIA ABSTRACT KATIKA CLASS INAMAANA HIO CLASS HUWE KUTENGENEZA OBJECT YAKE
 * ILA UNAWEZA KUTENGENEZA REFERENCE YAKE NA MARA NYINGI HUTUMIKA KATIKA PARENT CLASS*/

/*IF YOU HAVE ABSTRACT METHOD THEN THE CLASS SHALL ALSO BE ABSTRACT AND ABSTARCT METHOD
 * MUST BE OVERRIEDED IN SUBCLASSES FOR EACH AND THAT METHOD SHALL BE ONLY DECLARED IN PARENT CLASS*/

/*parent class*/
abstract class Parent{
	
	/*abstract method*/
	public abstract void greet();
}

/*first subclass*/
class Child1 extends Parent{
	
	/*overriding the abstract method*/
	@Override
	public void greet() {
		System.out.println("Good morning Mom! ");
	}
	
}

/*second subclass*/
class Child2 extends Parent{
	
	/*overriding the abstract method*/
	@Override
	public void greet() {
		System.out.println("Good morning Momma! ");
	}	
}
/*main class*/
public class Abstract_keyword {
	
	/*main method*/
	public static void main(String[] args) {

		/*creating reference of parent class and object of subclasses*/
		Parent object = new Child1();
		
		/*calling the first methods*/
		object.greet();
		
	
		/*calling the second method*/
		object = new Child2();
		object.greet();
	
	}

}
