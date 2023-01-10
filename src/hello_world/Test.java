package hello_world;


import java.util.function.Function;

public class Test {

    static Function<Integer, Integer>   incrementFunction = number -> number + 10;
    static Function<Integer, Integer> multiplyFunction1 = number -> number * 10;
    static Function<Integer, Integer> IncrementMultiplyFunction =
            incrementFunction.andThen(multiplyFunction1);

    public static void main(String[] args) {
        int result = incrementFunction.apply(5);
        int result1 = multiplyFunction1.apply(1);
        int result2 = IncrementMultiplyFunction.apply(1);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
