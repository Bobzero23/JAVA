package lambda_expression.example1;

/*Demonstration on how to display an Arraylist using lambda expression*/

import java.util.ArrayList;

public class Demo2 {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of Arraylist*/
        ArrayList<String> arrL = new ArrayList<>();

        /*adding some elements into it*/
        arrL.add("Jay");
        arrL.add("Kob");
        arrL.add("Dom");
        arrL.add("Oma");
        arrL.add("She");

        /*displaying arraylist using lambda expression with forEach method*/
        arrL.forEach(n -> System.out.println(n));

    }
}
