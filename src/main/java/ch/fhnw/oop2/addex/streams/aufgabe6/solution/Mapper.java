package ch.fhnw.oop2.addex.streams.aufgabe6.solution;

import java.util.Arrays;

public class Mapper {

    private Mapper() {}

    public static int[] flat(int[][] lists) {
        return Arrays
            .stream(lists)
            .flatMapToInt(Arrays::stream) // list -> Arrays.stream(list)
            .distinct()
            .sorted()
            .toArray();
    }
}
