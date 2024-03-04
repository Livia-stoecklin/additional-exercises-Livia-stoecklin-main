package ch.fhnw.oop2.addex.io.aufgabe2.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import ch.fhnw.oop2.addex.io.util.ResourceLoader;

public class TestWordCountUtil {

    @Test
    public void testReadLines() {
        // given
        final List<String> data = List.of("1", "2", "3");
        final Path file = ResourceLoader.getResource(this.getClass(), "data.txt");
        
        // when
        List<String> lines = WordCountUtil.readAllLines(file);

        // then
        assertEquals(first(data), first(lines));
        assertEquals(nth(data, 1), nth(lines, 1));
        assertEquals(nth(data, 2), nth(lines, 2));
    }

    public static <T>  T first(List<T> list) {
        return nth(list, 0);
    }

    public static <T>  T nth(List<T> list, int nthElement) {
        // Refactore: Use Optional here
        return list != null && list.size() >= (nthElement + 1) ? list.get(nthElement) : null; 
    }
    
}