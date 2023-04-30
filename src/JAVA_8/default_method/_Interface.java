package JAVA_8.default_method;

public interface  _Interface {
    void greetMe();

    default void sayGoodBye(String str) {
        System.out.println("GoodBye " + str);
    }
}
