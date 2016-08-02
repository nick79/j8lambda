package com.mnblog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Milan.Nikic on 8/2/2016.
 */
public class PersonUtil {

    public static List<Person> getPersons() {
        List<Person> result = new ArrayList<>();

        result.add(new Person("Eric", "Clapton", 71));
        result.add(new Person("Jimmy", "Page", 72));
        result.add(new Person("Joe", "Bonamassa", 39));
        result.add(new Person("John", "Mayer", 38));

        return result;
    }
}
