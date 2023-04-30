package JAVA_8.default_method;

public class Main implements _Interface{
    public static void main(String[] args) {
        Main mainObject = new Main();

        mainObject.greetMe();

        mainObject.sayGoodBye("Bobzero");
    }

    @Override
    public void greetMe() {
        System.out.println("Hello Bobzero");
    }
}
