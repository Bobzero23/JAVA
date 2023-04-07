package lambda_expression.example1;

/*Demonstration on how you can use lambda expression*/

/*creating interface*/
interface Demo{

    /*creating abstract method which takes int as a parameter*/
    void multiply(int x);

    /*creating a default method*/
    default  void  Def(){
        System.out.println("This is a default method");
    }
}

/*main class*/
public class Demo1 {

    /*main method*/
    public static void main(String[] args) {
        /*creating object of the interface with implementing the lambda expression*/
        Demo object = (int x) -> System.out.println(x*5);

        /*calling the lambda expression using the object we created*/
        object.multiply(2);
    }
}
