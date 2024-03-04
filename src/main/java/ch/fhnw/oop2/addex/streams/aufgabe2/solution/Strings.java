package ch.fhnw.oop2.addex.streams.aufgabe2.solution;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Strings {
    
    private Strings() {}

    public static double lengthAverage(String[] strings) {
        return Arrays
            .stream(strings)
            .map(String::length)
            .collect(Collectors.averagingDouble(s -> s));
    }
}
