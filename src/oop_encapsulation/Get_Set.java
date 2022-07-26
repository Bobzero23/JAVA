package oop_encapsulation;

/*ENCAPSULATION -> THE WAY OF BINDING VARIABLES TO A METHOD WHICH CALLED GETTERS AND SETTERS*/
/*ECLIPSE CAN AUTOMATICALLY PRIVIDE EVERY GETTERS AND SETTERS RIGHT CLIK THEN SOURCE*/


/*main class*/
public class Get_Set {
	
	private String name;
	private int age;
	private String school;
	
	

	/*THESE ARE THE GETTERS AND SETTERS*/
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getSchool() {
		return school;
	}



	public void setSchool(String school) {
		this.school = school;
	}



	/*main method*/
	public static void main(String[] args) {
		
		/*creating object for our class*/
		Get_Set object = new Get_Set();
		
		/*calling the methods*/
		object.setAge(21);
		
		
		/*displaying the  method*/
		System.out.println(object.getAge());
		

	}

}
