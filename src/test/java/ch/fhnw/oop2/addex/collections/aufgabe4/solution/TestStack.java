package ch.fhnw.oop2.addex.collections.aufgabe4.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestStack {

    @Test
    public void testGrow() {
        // given
        Stack stack = new Stack(2);
        

        // when
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        // then
        assertEquals(4, stack.size());

        assertEquals(4, stack.pop());
        assertEquals(3, stack.size());

        assertEquals(3, stack.pop());
        assertEquals(2, stack.size());

        assertEquals(2, stack.pop());
        assertEquals(1, stack.size());

        assertEquals(1, stack.pop());
        assertEquals(0, stack.size());
    }
}


