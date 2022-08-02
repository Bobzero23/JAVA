package project_student_management_app;

/*must imports*/
import java.util.*;

/*student class*/
public class Student {
	
	/*declaring variables we need*/
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static  int id = 1000; 
	
	/*constructor promts name and the year*/
	public Student() {
		
		/*creating a scanner object*/
		@SuppressWarnings("resource")
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
		
		/*calling the setStudentId method*/
		setStudentId();
	
	}
	
	/*generate an ID*/
	public void setStudentId() {
		
		/*everytime we create a new student we increment id by one*/
		id++;
		
		/*making student id*//*greade level + id*/
		this.studentID = gradeYear + "" + id;
	}

	/*enroll new courses*/
	public void enroll() {
	
		do {
			
			/*ask user what to course they wanna enroll or to enter Q to quit */
			System.out.print("Enter course to enroll.. (Q - to quit: )");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner (System.in);
			String course = scan.nextLine();
			
			/*our condition*/
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;	
			}else {
				break;
			}
		
			
		}while (1 != 0);

	}
	
	/*view balance*/
	public void viewBalance() {
		System.out.println("Your new balance is: $" + tuitionBalance);
	}
	
	/*pay tuition*/
	@SuppressWarnings("resource")
	public void payTuition() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your payment: $");
		int payment = scan.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment $" + payment + "\n");
		
	}
	/*show status*/
	public String showStatus() {
		return "FULL NAME: " + firstName + " " + lastName + "\n"
				+ "ID: " + studentID + "\n\n"
						+ "COURSE ENROLLED: " + courses + "\n"
								+ "TUITION BALANCE: " + tuitionBalance;
	}
}
