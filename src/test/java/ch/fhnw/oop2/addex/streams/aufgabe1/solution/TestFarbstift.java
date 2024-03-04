package ch.fhnw.oop2.addex.streams.aufgabe1.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFarbstift {

    private List<Farbstift> stifte;
    private static final String GRUEN = "grün";
    private static final String BLAU = "blau";
    private static final String ROT = "rot";
    private static final String VIOLETT = "violett";

    @BeforeEach
    public void before() {
        // Farbstifte könnten auch gut eine Enum sein.
        stifte = List.of(
            new Farbstift(ROT, 3),
            new Farbstift(BLAU, 2),
            new Farbstift(ROT, 3),
            new Farbstift(VIOLETT, 4),
            new Farbstift(GRUEN, 1),
            new Farbstift(GRUEN, 1)
        );
    }


    @Test
    public void testColorAsSet() {
        // when
        Set<String> farben = stifte
            .stream()
            .map(element -> element.getFarbe())
            .distinct() // equals muss implementiert sein!
            .collect(Collectors.toSet());

        // then
        assertEquals(4, farben.size());
        assertTrue(farben.contains(GRUEN));
        assertTrue(farben.contains(BLAU));
        assertTrue(farben.contains(ROT));
        assertTrue(farben.contains(VIOLETT));
    }

    @Test
    public void testProductIdsSorted() {
        // when
        List<Integer> farben = stifte
            .stream()
            .map(element -> element.getProductId())
            .sorted()
            .collect(Collectors.toList());

        // then
        assertEquals(6, farben.size());
        assertEquals(Integer.valueOf(1), farben.get(0));
        assertEquals(Integer.valueOf(1), farben.get(1));
        assertEquals(Integer.valueOf(2), farben.get(2));
        assertEquals(Integer.valueOf(3), farben.get(3));
        assertEquals(Integer.valueOf(3), farben.get(4));
        assertEquals(Integer.valueOf(4), farben.get(5));
    }

    @Test
    public void testProductIdGreenRed() {
        // when
        List<Integer> farben = stifte
            .stream()
            .filter(element -> element.getFarbe().equals(GRUEN) || element.getFarbe().equals(ROT))
            .map(Farbstift::getProductId) // es geht auch mit einer Methodenreferenz
            .sorted()
            .distinct()
            .collect(Collectors.toList());

        // then
        assertEquals(2, farben.size());
        assertEquals(Integer.valueOf(1), farben.get(0));
        assertEquals(Integer.valueOf(3), farben.get(1));
    }

    @Test
    public void testCountRed() {
        // when
        long anzahlStifteInRot = stifte
            .stream()
            .filter(element -> element.getFarbe().equals(ROT))
            .count();

        // then
        assertEquals(2, anzahlStifteInRot);
    }
}
