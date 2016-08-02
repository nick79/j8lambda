package com.mnblog;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Milan.Nikic on 8/2/2016.
 */
public class AppWithoutLambda {
    public static void main(String[] args) {

        List<Person> persons = PersonUtil.getPersons();

        System.out.println("Before sort:");
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();

        // sort by first name
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        System.out.println("After sorting by first name:");
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();

        // sort by last name
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        System.out.println("After sorting by last name:");
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println();

        // sort by age
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("After sorting by age:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
