package ch.fhnw.oop2.addex.generics.aufgabe2.solution;

import java.util.ArrayList;
import java.util.List;

public class Stack <Q> {

    private List<Q> elements = new ArrayList<>();

    public void push(Q value) {
        elements.add(value);
    }

    public Q pop() {
        return elements.remove(elements.size() - 1);
    }

    public int size() {
        return elements.size();
    }
}

