package ch.fhnw.oop2.addex.collections.aufgabe3.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class TestStack {

    @Test
    public void testPushPop() {
        // given
        Stack stack = new Stack();
        

        // when
        stack.push(1);
        stack.push(2);
        

        // then
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void testLowerBorder() {
        // given
        Stack stack = new Stack();

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
        catch(ArrayIndexOutOfBoundsException aioe) {
            assertTrue(true);
        }
    }
}

