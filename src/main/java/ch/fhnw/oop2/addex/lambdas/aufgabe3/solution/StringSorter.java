package ch.fhnw.oop2.addex.lambdas.aufgabe3.solution;

import java.util.Arrays;

public class StringSorter {
    
    private StringSorter() {}

    public static String[] reverse(String[] strings) {
        Arrays.sort(strings, (a, b) -> -1 * a.compareTo(b));
        return strings;
    }
}
