package static_keyword;
/*THE BEST FEATURE OF A STATIC IS THAT ALL OF THE OBJECTS OF THE SAME CLASS
  WILL SHARE THE SAME VALUE OF THE STATIC NO MATTER WHAT ALL OBJECTS */


/*main class*/
public class Students {

	/*declaring instance variables*/
	int age;
	String name;
	static String school;
	
	public void show() {
		System.out.println(name + " : " + age + " : " + school);
	}
	
	/*main method*/
	public static void main(String[] args) {

		/*creating an objects of the main class*/
		Students student1 = new Students();
		Students student2 = new Students();
		
		
		/*initializing the values for the first student*/
		student1.name = "Bobzero";
		student1.age = 21;
		//student1.school = "KTO";
		/*better to use class name to initialize static*/
		Students.school = "KTO";
		
		
		/*initializing the values for the first student*/
		student2.name = "TheProblem";
		student2.age = 25;
		
		
		student2.show();

		
	
	}

}
