package ch.fhnw.oop2.addex.streams.aufgabe3.solution;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Person) {
            Person p = (Person)other;
            return Objects.equals(name, p.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static Map<Boolean, List<Person>> group(List<Person> persons) {
        return persons
            .stream()
            .collect(Collectors.groupingBy(person -> person.getName().length() % 2 == 0));
    }
}
