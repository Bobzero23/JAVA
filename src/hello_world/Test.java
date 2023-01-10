package hello_world;


import java.util.function.Function;

public class Test {

    static Function<Integer, Integer> sampleFunction = number -> number * 10;
    static Function<Integer, Integer> sampleFunction1 = number -> number / 10;


    public static void main(String[] args) {
        int result = sampleFunction.apply(10);
        int result1 = sampleFunction1.apply(100);

        System.out.println(result1);
        System.out.println(result);
    }
}
