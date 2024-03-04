package ch.fhnw.oop2.addex.generics.aufgabe7.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class TestSets {

    @Test
    public void testCreate() {
        // given
        final String A = "A";
        final String B = "B";
        final String C = "C";

        // when
        try {
            Set<String> strings = Sets.of(A, B, C);

            // then
            assertEquals(3, strings.size());
            assertTrue(strings.contains(A));
            assertTrue(strings.contains(B));
            assertTrue(strings.contains(C));
        }
        catch(UnsupportedOperationException uoe) {
            fail();
        }
    }

    @Test
    public void testCreateWithDuplicates() {
        // given
        Set<Integer> ints = null;

        // when
        try {
            ints = Sets.of(1, 2, 42, 2, 5);
            fail();
        }
        catch(IllegalArgumentException lae) {
            // then
            assertNull(ints);
        }
    }
}
