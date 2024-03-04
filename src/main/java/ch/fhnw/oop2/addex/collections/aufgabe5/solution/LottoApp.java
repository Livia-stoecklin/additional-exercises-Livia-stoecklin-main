package ch.fhnw.oop2.addex.collections.aufgabe5.solution;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LottoApp {

    private static final int MAX_NUMBERS = 49;
    private static final int NUMBERS_TO_DRAW = 6;
   
    public Set<Integer> lotto() {

        List<Integer> numbers = Stream
            .iterate(1, number -> number + 1)
            .limit(MAX_NUMBERS)
            .collect(Collectors.toList());

        Collections.shuffle(numbers);

        return numbers
            .stream()
            .limit(NUMBERS_TO_DRAW)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
