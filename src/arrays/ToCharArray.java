package arrays;

/**This is a very useful method if you want to get access of the characters in the string */

/*main class*/
public class ToCharArray {

    /*main method*/
    public static void main(String[] args) {

        String str = "Bobzero";  // Creating a string

        // printing all the characters in the string using for loop
        for (char c : str.toCharArray()){
            System.out.println(c);
        }
    }
}
