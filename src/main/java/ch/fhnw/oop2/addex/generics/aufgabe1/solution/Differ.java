package ch.fhnw.oop2.addex.generics.aufgabe1.solution;

public class Differ {

    private Differ() {}

    public static <T extends Comparable<T>> int diff(T a, T b) { // Hier könnte man auch Comparable<? super T> verwenden.
        return a.compareTo(b);
    }
    
}
