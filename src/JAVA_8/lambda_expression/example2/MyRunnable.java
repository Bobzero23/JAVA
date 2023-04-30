package JAVA_8.lambda_expression.example2;



@FunctionalInterface
public interface MyRunnable {
    void run();
}

@FunctionalInterface
interface MyConsumer<String> {
    void accept(String str);
}


@FunctionalInterface
interface MyPredicate<Integer> {
    boolean test(int num);
}


class Test {
    public static void main(String[] args) {
        MyRunnable object1 = () -> System.out.println("what's up Bob");
        object1.run();

        MyConsumer<String> object2 = System.out::println;
        object2.accept("What's up Bro");

        MyPredicate object3 = (num) -> num > 0;
        System.out.println(object3.test(10));

    }
}
