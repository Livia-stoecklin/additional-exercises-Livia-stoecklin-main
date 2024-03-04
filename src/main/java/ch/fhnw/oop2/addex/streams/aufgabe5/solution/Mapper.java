package ch.fhnw.oop2.addex.streams.aufgabe5.solution;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Mapper {
    
    private Mapper() {}

    public static Set<Integer> flat(List<List<Integer>> lists) {
        return lists
            .stream()
            .flatMap(list -> list.stream()) // List::stream
            .distinct()
            .collect(Collectors.toCollection(TreeSet::new)); 
            // oder .collect(Collectors.toSet()); falls Ordnung kein Thema wäre.
    }
}
