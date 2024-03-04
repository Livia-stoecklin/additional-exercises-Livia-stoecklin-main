package ch.fhnw.oop2.addex.collections.aufgabe8.solution;

public class Hashtable <K, V> implements MinimalMap<K, V> {

    private static final int CAPACITY = 100;
    private Object[] values = new Object[CAPACITY];
    private int numberOfEntries = 0;
    
    public int size() {
        return numberOfEntries;
    }

    public void put(K key, V value) {
        if(numberOfEntries < CAPACITY) {
            if(values[position(key)] == null) {
                numberOfEntries++;
            }
            values[position(key)] = value;
        }
    }

    public V get(K key) {
        return (V)values[position(key)];
    }

    public void clear() {
        for(int i = 0; i < values.length; i++) {
            values[i] = null; 
        }
        numberOfEntries = 0;
    }

    private int position(K key) {
        return key.hashCode() % CAPACITY;
    }
}
