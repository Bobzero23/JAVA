package switch_case;
/*Switch = statement that allows a variable to be tested for equality 
 against a list of values  */
public class DayOfTheWeek {

	public static void main(String[] args) {
		String day = "Friday";
		
		switch(day) {
			case "Monday": System.out.println("GO TO SCHOOL!");
			break;
			case "Tuesday": System.out.println("GO TO SCHOOL!");
			break;
			case "Wednesday": System.out.println("GO TO SCHOOL!");
			break;
			case "Thursday": System.out.println("SLEEP!");
			break;
			case "Friday": System.out.println("SLEEP!");
			break;
			case "Saturday": System.out.println("SLEEP!");
			break;
			case "Sunday": System.out.println("SLEEPD!");
			break;
			
			// If we dont use break code will displays whatever comes after that case
		}
		

	}

}
