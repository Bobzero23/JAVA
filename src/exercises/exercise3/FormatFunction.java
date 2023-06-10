package exercises.exercise3;

public class FormatFunction {

    public static void main(String[] args) {

        String name = "Elif";
        int age = 30;
        double height = 1.95;


        String message = String.format("Benim adim %s, Ben %d yasindayim be boyum %.2f metre", name, age, height);

        System.out.println(message);
    }
}
