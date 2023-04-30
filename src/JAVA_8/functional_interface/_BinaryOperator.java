package JAVA_8.functional_interface;

import java.util.function.BinaryOperator;

public class _BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<String> greetMe = (str1, str2) -> str1 + str2;
        String greetingBob = greetMe.apply("Hello ","Bobzero");
        System.out.println(greetingBob);
    }
}
