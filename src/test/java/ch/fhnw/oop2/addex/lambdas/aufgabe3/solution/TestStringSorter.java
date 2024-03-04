package ch.fhnw.oop2.addex.lambdas.aufgabe3.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestStringSorter {

    @Test
    public void testSort() {
        // given
        final String A = "A";
        final String B = "B";
        final String C = "C";
        String[] words = { A, B, C };

        // when
        String[] result = StringSorter.reverse(words);
    
        // then
        assertEquals(C, result[0]);
        assertEquals(B, result[1]);
        assertEquals(A, result[2]);
    }
}
