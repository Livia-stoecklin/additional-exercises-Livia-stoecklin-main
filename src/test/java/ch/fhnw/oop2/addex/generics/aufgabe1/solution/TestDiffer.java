package ch.fhnw.oop2.addex.generics.aufgabe1.solution;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestDiffer {

    @Test
    public void testDiff() {
        // given
        final String A = "A";
        final String B = "B";

        // when
        int r1 = Differ.diff(A, B);
        int r2 = Differ.diff(A, A);
        int r3 = Differ.diff(B, A);

        // then
        assertTrue(r1 < 0);
        assertTrue(r2 == 0);
        assertTrue(r3 > 0);
    }
}
