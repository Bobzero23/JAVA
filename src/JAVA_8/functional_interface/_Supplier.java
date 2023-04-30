package JAVA_8.functional_interface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        Supplier<String> helloBobzero = () -> ("Hello Bobzero");
        String greetBob = helloBobzero.get();
        System.out.println(greetBob);
    }
}
