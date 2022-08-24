package supplier_interface;

/*This is interface is for implementing functional interface which its main feature is that it does not take any argument
* and also it so much useful when you want to use get() method */

import java.util.function.Supplier;

/*main class*/
public class Demo {

    /*main method*/
    public static void main(String[] args) {

        /*let's create object of Supplier to get a random number */
        Supplier<Double> object =  () -> Math.random();

        /*displaying the output using get method of Supplier*/
        System.out.println("The random double number is: " + object.get());
    }
}
