package FUNCTIONAL;

/*Example of the imperative approach*/

/*imports*/
import java.util.ArrayList;
import java.util.List;

import static FUNCTIONAL.Imperative_Example.Gender.FEMALE;
import static FUNCTIONAL.Imperative_Example.Gender.MALE;

public class Imperative_Example {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Bobzero", MALE),
                new Person("Aisha", FEMALE),
                new Person("Maria", FEMALE),
                new Person("John", MALE),
                new Person("Victoria", FEMALE)
        );

        System.out.println("IMPERATIVE APPROACH");
        List<Person> females = new ArrayList<>();

        for(Person person: people) {
            if(FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for(Person female: females) {
            System.out.println(female);
        }

        System.out.println("\nDECLARATIVE APPROACH");
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }

    enum Gender {
        MALE, FEMALE
    }
}
