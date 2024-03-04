package ch.fhnw.oop2.addex.lambdas.aufgabe4.solution;

import java.util.Arrays;

public class StringSorter {
    
    private StringSorter() {}

    public static String[] sortCaseInsensitive(String[] strings) {
        Arrays.sort(strings, String::compareToIgnoreCase);
        return strings;
    }
}