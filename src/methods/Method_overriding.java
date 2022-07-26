package methods;
/*WE SHALL KNOW THAT JAVA DOESNT SUPPORT MULTIPLE INHERITANCE BECAUSE OF AMBIGUITY*/
/*AMBIGUITY NI PALE CHILD CLASS INAPOKUWA NA METHOD SAME NA PARENT CLASS 
 * SO JAVA INAKUA HAIJUI IFANYE NINI NDO MANA HAISUPPORT*/

/*KWA KUTUTUMIA METHOD OVERRIDING TUNAWEZA TUMIA METHOD SAWA KATIKA PARENT PAMOJA NA CHILD*/

/*KWA KUTUMIA SUPER METHOD NDANI YA METHOD TUNAWEZA ZIITA ZOTE MBILI KWA WAKATI MMOJA*/

/*Parent class*/
class Mama{

	
	/*method which is gonna be overrided*/
	public void Chakula() {
		System.out.println("Mimi nina njaa pia");
	}
}

/*Subclass*/
class Mtoto extends Mama{
	
	/*this method is overrided*/
	@Override
	public void Chakula() {
		/*using super keyword*/
		super.Chakula();
		System.out.println("Mimi nina njaa");
	}
}

/*main class*/
public class Method_overriding {

	/*main method*/
	public static void main(String[] args) {
		
		/*creating an object for child class*/
		Mtoto mutoto = new Mtoto();
		
		/*calling the method*/
		mutoto.Chakula();
	}

}
