package ch.fhnw.oop2.addex.collections.aufgabe8.solution;

public interface MinimalMap <K, V> {
    int size();
    void put(K key, V value);
    V get(K key);
    void clear();
}
