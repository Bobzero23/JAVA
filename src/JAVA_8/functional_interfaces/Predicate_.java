package JAVA_8.functional_interfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicate_ {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> (num % 2) == 0;
        System.out.println(isEven.test(6));

        BiPredicate<Integer,Integer> areEven = (num1, num2) -> (num1 + num2) % 2 == 0;
        System.out.println(areEven.test(6,7));
    }
}
