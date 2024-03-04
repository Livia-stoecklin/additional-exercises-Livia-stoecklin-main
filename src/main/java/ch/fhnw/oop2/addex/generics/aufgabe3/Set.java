package ch.fhnw.oop2.addex.generics.aufgabe3;

import java.util.List;

public interface Set <T> {


    boolean add(T element);

    boolean contains(T element) ;
    List<T> elements();
}
