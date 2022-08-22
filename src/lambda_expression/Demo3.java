package lambda_expression;

/*main class*/
public class Demo3 {

    /*interface1*/
    interface interface1{
        int operation(int x, int y);
    }

    /*interface2*/
    interface interface2{
        void Speak(String message);
    }

    /*method to operate the method inside interface1*/
    private int operate(int x, int y, interface1 object1){
        return object1.operation(x, y);
    }

    /*main method*/
    public static void main(String[] args) {

        /*object of the interface1 which does addition*/
        interface1 add = (int x, int y) -> x + y;

        /*object of the interface1 which does multiplication*/
        interface1 multiply = (int x, int y) -> x * y;

        /*creating object of the main class*/
        Demo3 demo = new Demo3();

        /*using object of the main class to call the operate method and displaying addition*/
        System.out.println("The solution of the addition is: " + demo.operate(10, 10, add));

        /*using object of the main class to call the operate method and displaying multiplication*/
        System.out.println("The solution of the multiplication is: " + demo.operate(10, 10, multiply));

        /*creating object of the interface2 and assigning the text*/
        interface2 object2 = message -> System.out.println("What's up! " + message);

        /*using the object of the interface2 to call the method*/
        object2.Speak("Bobzero");
    }
}
