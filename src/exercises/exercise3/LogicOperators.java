package exercises.exercise3;

import java.util.Scanner;

/*This code will use operators to check if the input is even or not*/
public class LogicOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input: ");
        int input = scanner.nextInt();


        if(input % 2 == 0) {
            System.out.println("The input is Even number");
        }else {
            System.out.println("The input is not Even number");
        }

    }
}
