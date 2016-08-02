package com.mnblog;

import java.util.List;

/**
 * Created by Milan.Nikic on 8/2/2016.
 */
public class AppWithLambda {

    public static void main(String[] args) {
        List<Person> persons = PersonUtil.getPersons();

        System.out.println("Before sort:");
        persons.forEach(System.out::println);
        System.out.println();

        // sort by first name
        persons.sort((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        System.out.println("After sorting by first name:");
        persons.forEach(System.out::println);
        System.out.println();

        // sort by last name
        persons.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        System.out.println("After sorting by last name:");
        persons.forEach(System.out::println);
        System.out.println();

        // sort by age
        persons.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println("After sorting by age:");
        persons.forEach(System.out::println);
        System.out.println();
    }
}
