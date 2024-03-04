package ch.fhnw.oop2.addex.collections.aufgabe7.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestBook {
    
    @Test
    public void test() {
        // given
        List<Book> books = new ArrayList<>(
            List.of(
                new Book("A", 100.0f), new Book("B", 20.0f), new Book("A", 50.0f), new Book("A", 80.0f)
            )
        );

        // when
        Collections.sort(books);

        // then
        assertEquals(20.0f, books.get(0).getPrice(), 0.0);
        assertEquals(50.0f, books.get(1).getPrice(), 0.0);
        assertEquals(80.0f, books.get(2).getPrice(), 0.0);
        assertEquals(100.0f, books.get(3).getPrice(), 0.0);
    }
}
