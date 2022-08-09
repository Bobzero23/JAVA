package colection_and_generics;
/*WE WILL SEE HOW TO USE COMPARABLE INTERFACE*/ 

/*needed imports*/
import java.util.*;

/*Stud class is here*/
class Stud implements Comparable<Stud>{
	
	/*declaring some variables*/
	int rollNo;
	String name;
	int grades;
	
	/*creating a constructor*/
	public Stud(int rollNo, String name, int grades) {
		this.rollNo = rollNo;
		this.name = name;
		this.grades = grades;
	}

	/*this method will be called when the object of the class is called*/
	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", name=" + name + ", grades=" + grades + "]";
	}
	
	/*this is a special method for comaprable*/
	/*use it to compare the data*/
	@Override
	public int compareTo(Stud s) {
		
		/*here write down how do you wanna compare*/
		return grades<s.grades?1:-1;
	}



}

/*main class*/
public class Comparable_interface {

	/*main method*/
	public static void main(String[] args) {

		/*creating a list object*/
		List<Stud> studs = new ArrayList<Stud>();
		
		/*passing some values to the list*/
		studs.add(new Stud(1, "John", 86));
		studs.add(new Stud(2, "Wonder", 90));
		studs.add(new Stud(3, "TheProblem", 80));
		studs.add(new Stud(4, "Bobzero", 95));
		
		/*lets try to sort them*/
		Collections.sort(studs);
		
		/*displaying the students*/
		for(Stud s : studs) {
			System.out.println(s);
		}
	}

}
