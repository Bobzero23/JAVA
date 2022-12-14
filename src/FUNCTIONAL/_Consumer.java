package FUNCTIONAL;

import java.util.function.Consumer;

public class _Consumer {

    static class Costumer{
        private final String costumerName;
        private final int costumerPhoneNumber;

        Costumer(String costumerName, int costumerPhoneNumber) {
            this.costumerName = costumerName;
            this.costumerPhoneNumber = costumerPhoneNumber;
        }
    }

    /*USING JAVA NORMAL FUNCTION*/
    static  void greetCostumer(Costumer costumer) {
        /*calling a normal method*/
        System.out.println("Hello " + costumer.costumerName + ", Thank you for registering phone number " +
                costumer.costumerPhoneNumber);

        /*creating a new costumer*/
        Costumer costumer1 = new Costumer("maria", 526526);

        /*calling a consumer interface*/
        greetCostumerConsumer.accept(costumer1);
    }

    /*USING CONSUMER FUNCTIONAL INTERFACE*/
    static Consumer<Costumer> greetCostumerConsumer = costumer ->
            System.out.println("Hello " + costumer.costumerName + ", Thank you for registering phone number "
            + costumer.costumerPhoneNumber);

    public static void main(String[] args) {
        greetCostumer(new Costumer("Bobzero",415415));
    }
}
