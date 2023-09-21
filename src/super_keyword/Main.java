package super_keyword;

class Animal {
    public Animal () {
        System.out.println("I am the parent class");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("I am the child class");
    }
}



public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
    }
}