package ch.fhnw.oop2.addex.generics.aufgabe3.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestSet {

    @Test
    public void testAdd() {
        // given
        Set<String> set = new SetImpl<>();
        final String A = "A";

        // when
        boolean r1 = set.add(A);
        boolean r2 = set.add(A);
        
        // then
        assertTrue(r1);
        assertFalse(r2);
    }

    @Test
    public void testContains() {
        // given
        Set<String> set = new SetImpl<>();
        final String A = "A";
        final String B = "B";

        // when
        set.add(A);
        
        // then
        assertTrue(set.contains(A));
        assertFalse(set.contains(B));
    }

    @Test
    public void testElements() {
        // given
        Set<Integer> set = new SetImpl<>();
        for (int i = 1; i <= 3; i++) {
            set.add(i);
        }

        // when
        List<Integer> result = set.elements();
        
        // then
        assertEquals(3, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
    }

    @Test
    public void testElementsUnmodifiable() {
        // given
        Set<Integer> set = new SetImpl<>();
        for (int i = 1; i <= 3; i++) {
            set.add(i);
        }

        // when
        List<Integer> result = set.elements();
        
        // then
        try {
            result.remove(1);
            fail();
        }
        catch(UnsupportedOperationException uoe) {
            assertTrue(true);
        }
    }
}


