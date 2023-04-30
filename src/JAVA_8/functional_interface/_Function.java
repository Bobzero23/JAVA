package JAVA_8.functional_interface;

/*EXAMPLE ON HOW TO USE JAVA UTIL FUNCTIONS*/

/*imports*/
import java.util.function.Function;

public class _Function {

    /*THIS IS HOW WE USED TO DO*/
    static int increment(int number) {
        return number + 1;
    }

    /*THIS IS HOW NOW IT IS DONE*/
    /*<T, R> stands for data types of the input and the output*/
    /*number is the variable name of the input*/
    static Function<Integer, Integer> IncrementByOneFunction = number -> number + 1;

    /*function for multiplication*/
    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    public static void main(String[] args) {
       int result1 = increment(9);
        System.out.println(result1);

        /*HOW TO USE APPLY*/
        int applyIncrement = IncrementByOneFunction.apply(5);
        System.out.println(applyIncrement);

        int multiply = multiplyByTen.apply(applyIncrement);
        System.out.println(multiply);

        /*How to use AND THEN*/
        /*we normally use this to put two or more method work together*/
        Function<Integer, Integer> incrementAndThenMultiply =
                IncrementByOneFunction.andThen(multiplyByTen);

        System.out.println(incrementAndThenMultiply.apply(4));
    }
}
