package JAVA_8.functional_interface;

import org.w3c.dom.ls.LSOutput;

import java.util.function.UnaryOperator;

public class _UnaryOperator {

    public static void main(String[] args) {
        UnaryOperator<Integer> numSquare = num -> num * num;
        int result = numSquare.apply(10);
        System.out.println(result);
    }
}
