package ch.fhnw.oop2.addex.generics.aufgabe3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetImpl <T> implements Set<T>{
    List<T> element = new ArrayList<>();

    @Override
    public boolean add(T element) {
        if(!elements().contains(element)){
            elements().add(element);
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(T element) {
        return elements().contains(element);

    }

    @Override
    public List <T> elements() {
        return Collections.unmodifiableList(elements());
    }
}
