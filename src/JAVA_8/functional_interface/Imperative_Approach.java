package JAVA_8.functional_interface;

/*Example of the imperative approach*/

/*imports*/
import java.util.ArrayList;
import java.util.List;

import static JAVA_8.functional_interface.Imperative_Approach.Gender.FEMALE;
import static JAVA_8.functional_interface.Imperative_Approach.Gender.MALE;

public class Imperative_Approach {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Bobzero", MALE),
                new Person("Aisha", FEMALE),
                new Person("Maria", FEMALE),
                new Person("John", MALE),
                new Person("Victoria", FEMALE)
        );

        /*HERE IS HOW YOU USE THE IMPERATIVE APPROACH*/
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
