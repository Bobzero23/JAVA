package JAVA_8.functional_interface;

import java.util.function.BiConsumer;
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

        /*calling a consumer interface inside the normal function*/
        greetCostumerConsumer.accept(costumer1);
    }

    /*USING CONSUMER JAVA_8.FUNCTIONAL INTERFACE*/
    static Consumer<Costumer> greetCostumerConsumer = costumer ->
            System.out.println("Hello " + costumer.costumerName + ", Thank you for registering phone number "
            + costumer.costumerPhoneNumber);

    /*USING BI CONSUMER INTERFACE*/
    static BiConsumer<Costumer, Boolean> greetCostumerBiConsumer = (costumer, showPhoneNumber) ->
            System.out.println("Hello " + costumer.costumerName +
                    " Thanks for registering phone number " +
                    (showPhoneNumber ? costumer.costumerPhoneNumber : "*****"));

    public static void main(String[] args) {
        /*creating the costumer*/
        Costumer Bobzero = new Costumer("Bobzero", 748748);

        /*calling the normal method*/
        greetCostumer(new Costumer("Bobzero",415415));

        /*calling the consumer method*/
        greetCostumerConsumer.accept(Bobzero);

        /*calling the bi consumer method*/
        greetCostumerBiConsumer.accept(Bobzero, false);
    }
}
