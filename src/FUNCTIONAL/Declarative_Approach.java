package FUNCTIONAL;

/*Example of the declarative approach*/

/*imports*/
import java.util.List;
import java.util.function.Predicate;

import static FUNCTIONAL.Declarative_Approach.Gender.FEMALE;
import static FUNCTIONAL.Declarative_Approach.Gender.MALE;


public class Declarative_Approach {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Bobzero", MALE),
                new Person("Aisha", FEMALE),
                new Person("Maria", FEMALE),
                new Person("John", MALE),
                new Person("Victoria", FEMALE)
        );

        /*HERE IS HOW YOU USE THE DECLARATIVE APPROACH*/
        people.stream()
                .filter(person -> MALE.equals(person.gender))
                .forEach(System.out::println);

        System.out.println("\n");

        /*HERE IS HOW TO USER PREDICATE*/
        Predicate<Person> PersonPredicate = person -> FEMALE.equals(person.gender);
        people.stream()
                .filter(PersonPredicate)
                .forEach(System.out::println);

    }


    public static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender  = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
