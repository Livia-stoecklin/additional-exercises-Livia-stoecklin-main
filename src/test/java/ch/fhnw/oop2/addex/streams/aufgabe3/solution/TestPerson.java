package ch.fhnw.oop2.addex.streams.aufgabe3.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TestPerson {

    @Test
    public void testGrouping() {
        // given
        final String a = "a";
        final String bb = "bb";
        final String cc = "cc";
        final String dddd = "dddd";
        List<Person> persons = List.of(
            new Person(a),
            new Person(bb),
            new Person(cc),
            new Person(dddd)
        );

        // when
        Map<Boolean, List<Person>> result = Person.group(persons);

        // then
        assertEquals(2, result.size());
        assertEquals(3, result.get(Boolean.TRUE).size());
        assertEquals(1, result.get(Boolean.FALSE).size());

        assertTrue(result.get(Boolean.FALSE).contains(new Person(a)));
        assertTrue(result.get(Boolean.TRUE).contains(new Person(bb)));
        assertTrue(result.get(Boolean.TRUE).contains(new Person(cc)));
        assertTrue(result.get(Boolean.TRUE).contains(new Person(dddd)));
    }
}
