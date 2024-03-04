package ch.fhnw.oop2.addex.streams.aufgabe4.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class TestSum {

    @Test
    public void test() {
        // when
        long result = Stream
            .iterate(1, i -> i + 1)
            .limit(100)
            .reduce(0, (acc, b) -> acc + b);

        // then
        assertEquals(5050, result);
    }
}