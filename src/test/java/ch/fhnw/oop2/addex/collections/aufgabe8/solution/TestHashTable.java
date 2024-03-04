package ch.fhnw.oop2.addex.collections.aufgabe8.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestHashTable {

    @Test
    public void testEmpty() {
        // given
        MinimalMap<String, String> table = new Hashtable<>();

        // then
        assertEquals(0, table.size());
    }

    @Test
    public void testSize() {
        // given
        MinimalMap<String, String> table = new Hashtable<>();

        // when
        table.put("A", "A");
        table.put("A", "A");
        table.put("B", "B");
        table.put("C", "C");

        // then
        assertEquals(3, table.size());
    }
    
    @Test
    public void testClear() {
        // given
        MinimalMap<String, String> table = new Hashtable<>();
        table.put("A", "A");
        table.put("B", "B");
        table.put("C", "C");
        
        // when
        table.clear();
        
        // then
        assertEquals(0, table.size());
    }

    @Test
    public void testPutGet() {
        // given
        MinimalMap<String, String> table = new Hashtable<>();
        final String A = "A";
        final String B = "B";
        final String C = "C";
        table.put(A, A);
        table.put(B, B);
        table.put(C, C);
        
        // when
        String r1 = table.get(new String(A));
        String r2 = table.get(new String(B));
        String r3 = table.get(new String(C));
        
        // then
        assertEquals(A, r1);
        assertEquals(B, r2);
        assertEquals(C, r3);
    }
}