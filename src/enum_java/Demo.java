package enum_java;

/*here we gonna demostrate on how to use enums*/

/*creating enum*/
enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

/* main class */
public class Demo {

	/* creating enums object */
	Day day;

	/* creating a constructor which has parameter of enum and it is object */
	public Demo(Day day) {
		this.day = day; // initializing
	}

	/* creating a method that will use enums object */
	public void howIsDay() {
		switch (day) {

		case MONDAY:
			System.out.println("The worst day ever..");
			break;
		case FRIDAY:
			System.out.println("The best day ever..");
			break;
		case SUNDAY:
			System.out.println("Why is it Sunday meh..");
			break;
		case WEDNESDAY:
			System.out.println("How come we still in Wednesday..");
			break;

		}
	}

	/* main driver method */
	public static void main(String[] args) {

		/*creating a variable to hold the day*/
		String var = "MONDAY";
		
		/*creating object of class*/
		Demo object = new  Demo(Day.valueOf(var));
		object.howIsDay();
		
		
	
		
	}
	
}
