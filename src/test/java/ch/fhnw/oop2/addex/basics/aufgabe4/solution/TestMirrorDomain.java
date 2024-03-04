package ch.fhnw.oop2.addex.basics.aufgabe4.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestMirrorDomain {
    
    @Test
    public void testMirror() {
        // given
        final String address = "hermann.maier@students.uni-linz.ac.at";

        // when
        String result = MirrorDomain.domain(address);

        // then
        assertEquals("at.ac.uni-linz.students", result);
    }

    @Test
    public void testMirrorEmptyString() {
        // given
        final String address = "";

        // when
        String result = MirrorDomain.domain(address);

        // then
        assertEquals("", result);
    }

    @Test
    public void testMirrorNull() {
        // given
        final String address = null;

        // when
        String result = MirrorDomain.domain(address);

        // then
        assertEquals("", result);
    }

    @Test
    public void testMirrorWithoutDelimiters() {
        // given
        final String address = "test";

        // when
        String result = MirrorDomain.domain(address);

        // then
        assertEquals("", result);
    }
}
