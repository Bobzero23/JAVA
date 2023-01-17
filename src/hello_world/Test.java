package hello_world;


import java.util.function.Function;

public class Test {

    static class Costumer{
        private String costumerName;
        private int costumerPhoneNumber;

        public Costumer(String costumerName, int costumerPhoneNumber){
            this.costumerName = costumerName;
            this.costumerPhoneNumber = costumerPhoneNumber;
        }

    }

    static void greetingFunction(Costumer costumer) {
        System.out.println("Hello " + costumer.costumerName + ", your phone number " + costumer.costumerPhoneNumber +
                " is successfully added to the system..");
    }

    public static void main(String[] args) {
        greetingFunction(new Costumer("Bobzero", 298543));
    }
}
