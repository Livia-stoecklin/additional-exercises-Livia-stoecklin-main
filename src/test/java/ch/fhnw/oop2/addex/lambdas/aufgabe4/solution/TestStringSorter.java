package ch.fhnw.oop2.addex.lambdas.aufgabe4.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestStringSorter {
    
    @Test
    public void testSortWithEffect() {
        // given
        final String a = "a";
        final String b = "b";
        final String c = "c";
        String[] words = { b, a, c };

        // when
        String[] result = StringSorter.sortCaseInsensitive(words);

        // then
        assertEquals(a, result[0]);
        assertEquals(b, result[1]);
        assertEquals(c, result[2]);
    }

    @Test
    public void testSortWithNoEffectBecauseOfCaseInsensitivOrdering() {
        // given
        final String AAA = "AAA";
        final String Aaa = "Aaa";
        final String AAa = "AAa";
        String[] words = { Aaa, AAA, AAa };

        // when
        String[] result = StringSorter.sortCaseInsensitive(words);

        // then
        assertEquals(Aaa, result[0]);
        assertEquals(AAA, result[1]);
        assertEquals(AAa, result[2]);
    }
}