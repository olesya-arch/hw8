package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
    Person p1 = new Person("Paul", "Rup", new Address("Chelsea", "Royal",25 ));
    Person p2 = new Person("Sam", "Young", new Address("London", "Vincent",17 ));
    Person p3 = new Person("Carl", "Lee", new Address("Dublin", "Stammer",48 ));
    Person p4 = new Person(null, "Smith", new Address("Cork", "Cov",36 ));
    Person p5 = new Person("Nick", null, new Address("Prague", "Albert",61 ));
    Person p6 = new Person("Siena", "Miller", null);

    List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));

    List<Person> people = persons
            .stream()
            .filter(p -> p.getName() != null && p.getLastName() != null && p.getAddress() != null)
            .sorted(Comparator.comparing(p -> p.getAddress().getNumberHouse()))
            .collect(Collectors.toList());
    List<String> list = people
            .stream()
            .map(Person::toString)
            .collect(Collectors.toList());

    people.forEach(System.out::println);
    }
}
