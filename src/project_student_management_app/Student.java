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
	private String courses;
	private int tuitionBalance = 0;
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
		
		/*calling the setStudentId method*/
		setStudentId();
		
		/*displaying the results*/
		System.out.println(firstName + " "+ lastName + " " + gradeYear + " " + studentID);
		
	
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
			Scanner scan = new Scanner (System.in);
			String course = scan.nextLine();
			
			/*our condition*/
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;	
			}else {
				System.out.println("BREAK!");
				break;
			}
		
			
		}while (1 != 0);

		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	
	/*view balance*/
	/*pay tuition*/
	/*show status*/
}
