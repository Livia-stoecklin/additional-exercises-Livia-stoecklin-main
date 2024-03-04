package ch.fhnw.oop2.addex.generics.aufgabe2.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;


public class TestStack {

    @Test
    public void testPushPop() {
        // given
        Stack<String> stack = new Stack<>();
        final String A = "A";
        final String B = "B";

        // when
        stack.push(A);
        stack.push(B);
        

        // then
        assertEquals(B, stack.pop());
        assertEquals(A, stack.pop());
    }

    @Test
    public void testLowerBorder() {
        // given
        Stack<Integer> stack = new Stack<>();

        // when
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        
        // then
        try {
            stack.pop();
            fail();
        }
        catch(IndexOutOfBoundsException ioe) {
            assertTrue(true);
        }
    }
}

