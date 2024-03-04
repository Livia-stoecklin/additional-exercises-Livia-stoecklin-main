package ch.fhnw.oop2.addex.collections.aufgabe2.solution;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class TestAnagram {

    @Test
    public void testNull() {
        // given
        Anagram anagram = new Anagram();
        String w1 = null;
        String w2 = null;

        // when
        boolean result = anagram.isAnagram(w1, w2);

        // then
        assertFalse(result);
    }
 
    @Test
    public void testAnagram() {
        // given
        Anagram anagram = new Anagram();
        String w1 = "ABC";
        String w2 = "cba";
        String w3 = "cbb";


        // when
        boolean r1 = anagram.isAnagram(w1, w2);
        boolean r2 = anagram.isAnagram(w1, w3);

        // then
        assertTrue(r1);
        assertFalse(r2);
    }
}
