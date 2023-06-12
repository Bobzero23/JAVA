package exercises.exercise7;

abstract class AbstractClass {
    public abstract void makeSound();


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}

class Dog extends AbstractClass {

    @Override
    public void makeSound() {
        System.out.println("Whro");
    }
}

class Cat extends  AbstractClass {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}