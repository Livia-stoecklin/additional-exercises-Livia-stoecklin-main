package ch.fhnw.oop2.addex.generics.aufgabe3.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetImpl <K> implements Set<K> {

    private List<K> elements = new ArrayList<>(); 

    public boolean add(K element) {
        if(!elements.contains(element)) {
            elements.add(element);
            return true;
        }
        return false;
    }

    public boolean contains(K element) {
        return elements.contains(element);
    }

    public List<K> elements() {
        return Collections.unmodifiableList(elements);
    }
}
