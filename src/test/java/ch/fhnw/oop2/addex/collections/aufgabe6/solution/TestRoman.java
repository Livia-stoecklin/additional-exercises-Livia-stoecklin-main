package ch.fhnw.oop2.addex.collections.aufgabe6.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestRoman {

    @Test
    public void testGrow() {
        // given
        Roman roman = new Roman();
        final String I = "I";
        final String V = "V";
        // ...
        final String M = "M";

        // when
        int resultI = roman.translate(I);
        int resultV = roman.translate(V);
        int resultM = roman.translate(M);
        
        // then
        assertEquals(1, resultI);
        assertEquals(5, resultV);
        assertEquals(1000, resultM);
    }

    @Test
    public void testAllKeys() {
        // given
        Roman roman = new Roman();
        final String[] givenKeys = { "I", "V", "X", "L", "C", "D", "M" };

        // when
        List<String> keys = roman.allKeys();
        
        // then
        assertEquals(7, keys.size());
        for(int i = 0; i < givenKeys.length; i++) {
            assertEquals(givenKeys[i], keys.get(i));
        }
    }
}




