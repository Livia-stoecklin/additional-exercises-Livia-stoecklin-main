package ch.fhnw.oop2.addex.streams.aufgabe5.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class TestMapper {

    @Test
    public void testFlat() {
        // given
        List<List<Integer>> lists = List.of(
            List.of(19, 2),
            List.of(2, 3, 5),
            List.of(2, 7, 11, 2)
        );

        // when
        Set<Integer> result = Mapper.flat(lists);

        // then
        assertEquals(6, result.size());

        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertTrue(result.contains(5));
        assertTrue(result.contains(7));
        assertTrue(result.contains(11));
        assertTrue(result.contains(19));
    }
}
