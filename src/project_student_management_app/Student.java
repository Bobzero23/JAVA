package project_student_management_app;

/*must imports*/
import java.util.*;

/*student class*/
public class Student {
	
	/*declaring variables we need*/
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static  int id = 1000; 
	
	/*constructor promts name and the year*/
	public Student() {
		
		/*creating a scanner object*/
		Scanner scan = new Scanner(System.in);
		
		/*getting info from the user*/
		System.out.println("Enter the first name: ");
		this.firstName = scan.nextLine();
		System.out.println("Enter the last name: ");
		this.lastName = scan.nextLine();
		System.out.println("Enter the student class level : \n"
				+ "1 - for freshmen \n"
				+ "2 - for saphomore \n"
				+ "3 - for junior \n"
				+ "4 - for senior ");
		this.gradeYear = scan.nextInt();
		
		/*displaying the results*/
		System.out.println(firstName + " "+ lastName + " " + gradeYear);
	
		/*everytime we create a new student we increment id by one*/
		id++;
	
	}
	
	/*generate an ID*/
	/*enroll new courses*/
	/*view balance*/
	/*pay tuition*/
	/*show status*/
}
