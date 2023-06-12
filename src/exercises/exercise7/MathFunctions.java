package exercises.exercise7;

public class MathFunctions {
    public static double pow(double number , int power) {
        double result = number;
        for(int i=0; i<(power-1) ; i++)
            result = result*number;
        return result;
    }

    public static void main(String[] args) {
        double result = MathFunctions.pow(5, 2);
        System.out.println(result);
    }
}
