package ch.fhnw.oop2.addex.generics.aufgabe7.solution;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    
    private Sets() {}

    public static <A> Set<A> of(A... args) {
        Set<A> set = new HashSet<>();
        for (A a : args) {
            if(!set.add(a)) {
                throw new IllegalArgumentException();
            }
        }
        return set;
    }
}
