package ch.fhnw.oop2.addex.streams.aufgabe6.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMapper {

    @Test
    public void testFlat() {
        // given
        int[][] lists = {
            {19, 2},
            {2, 3, 5},
            {2, 7, 11, 2}
        };

        // when
        int[] result = Mapper.flat(lists);

        // then
        assertEquals(6, result.length);

        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
        assertEquals(5, result[2]);
        assertEquals(7, result[3]);
        assertEquals(11, result[4]);
        assertEquals(19, result[5]);
    }
}

