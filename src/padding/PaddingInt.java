package padding;

/*Demonstration on how to pad integer with zero*/
/*Let's say we want to print integer with exactly 5 digits but the user inter the integer with 3 digits so we gonna
* hava to pad two zeros on the left to make it 5 digits right, check what I did below*/

import java.util.Scanner;

/*main class*/
public class PaddingInt {

    /*padding method*/
    public String paddingInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number with 5 digits: ");
        int input = scan.nextInt();
        scan.close();
        return String.format("%05d", input);
    }

    /*main method*/
    public static void main(String[] args) {

        PaddingInt object = new PaddingInt();
        String result = object.paddingInt();
        System.out.println(result);

    }

}
