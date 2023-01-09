package hello_world;

import java.util.List;

import static hello_world.Test.Gender.FEMALE;
import static hello_world.Test.Gender.MALE;

public class Test {

    enum Gender {
        MALE, FEMALE
    }

    public static class Human{
        private final String name;
        private final Gender gender;

        public Human(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Human> human_beings =  List.of(
            new Human("Bobzero", MALE),
            new Human("Kombo", FEMALE),
            new Human("Maho", FEMALE)
        );

        human_beings.stream()
                .filter(human -> FEMALE.equals(human.gender))
                .forEach(System.out::println);
    }
}
