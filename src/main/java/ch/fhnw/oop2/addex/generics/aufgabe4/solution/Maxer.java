package ch.fhnw.oop2.addex.generics.aufgabe4.solution;

import java.util.List;

public class Maxer {

    private Maxer() {}

    public static <X extends Comparable<X>> X max(List<X> values) {
        return values
            .stream()
            .max((a, b) -> a.compareTo(b)) // Comparable im Comparator verwenden.
            .orElse(null);
    }
    
}
