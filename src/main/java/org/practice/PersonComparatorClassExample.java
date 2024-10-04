package main.java.org.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonComparatorClassExample {
    String name;
    int age;

    PersonComparatorClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
    public static void main(String[] args) {
        List<PersonComparatorClassExample> people = new ArrayList<>();
        people.add(new PersonComparatorClassExample("Alice", 30));
        people.add(new PersonComparatorClassExample("Bob", 25));
        people.add(new PersonComparatorClassExample("Charlie", 35));

        // Sort the list by age
        people.sort(Comparator.comparingInt(personComparatorClassExample -> personComparatorClassExample.age));
        people.sort(Comparator.comparingInt((PersonComparatorClassExample personComparatorClassExample) -> personComparatorClassExample.age).thenComparing(personComparatorClassExample -> personComparatorClassExample.name));

        System.out.println("Sorted List (By Age): " + people);
    }
}
