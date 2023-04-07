package ternary_operators;

public class Main {
    public static void main(String[] args) {
        int num = 5;
        String result = (num > 10) ? "Greater than 10" : (num < 10) ? "Less than 10" : "It is 10";
        System.out.println(result);
    }
}
