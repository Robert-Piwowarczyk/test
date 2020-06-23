import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        public static class Person {
            private String firstName;
            private String lastName;

            public Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
                public String getFirstName() {
                    return firstName;
                }

                public String getLastName() {
                    return lastName;
                }

        Stream.of(1, 2, 3, 4, 4, 2, 5, 1)
                .distinct()
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        List<Person> personList = List.of(new Person("Marcin", "P"), new Person("Jan", "Kowalski"), new Person("Jan", "Kowalski"));
        personList.stream()
                .distinct()
                .map(Person::getLastName)
                .forEach(System.out::println);
            }
        }
    }
}