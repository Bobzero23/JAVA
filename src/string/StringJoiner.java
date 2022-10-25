package string;

/**Cool method to join two strings*/


/*main class*/
public class StringJoiner {

    /*main method*/
    public static void main(String[] args) {

        //creating string variables
        String firstName = "Bobzero";
        String lastName = "TheProblem";

        //joining string using join method
        String fullName = String.join(" ", firstName, lastName);

        //displaying the result
        System.out.println("His full name is: " + fullName);
    }
}
