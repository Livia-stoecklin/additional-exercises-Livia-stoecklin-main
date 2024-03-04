package ch.fhnw.oop2.addex.collections.aufgabe6.solution;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Roman {

    private Map<String, Integer> table;

    public Roman() {
        table = new LinkedHashMap<>();
        table.put("I", 1);
        table.put("V", 5);
        table.put("X", 10);
        table.put("L", 50);
        table.put("C", 100);
        table.put("D", 500);
        table.put("M", 1000);
    }
    
    public int translate(String romanNumber) {
        return table.get(romanNumber);
    }

    public List<String> allKeys() {
        return table
            .keySet()
            .stream()
            .collect(Collectors.toList());
    }
}
