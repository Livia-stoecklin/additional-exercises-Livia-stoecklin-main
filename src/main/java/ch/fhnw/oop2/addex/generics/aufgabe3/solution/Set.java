package ch.fhnw.oop2.addex.generics.aufgabe3.solution;

import java.util.List;

public interface Set <MyType> {
    boolean add(MyType element);
    boolean contains(MyType element);
    List<MyType> elements();
}
