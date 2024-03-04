package ch.fhnw.oop2.addex.basics.aufgabe4.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MirrorDomain {

    private MirrorDomain() {}

    private static final String EMPTY = "";
    private static final String AT = "@";
    private static final String POINT = "\\.";

    public static String domain(String address) {
        // Precondition
        if(address == null || address.isEmpty() || !(address.contains(AT) && address.contains("."))) {
            return EMPTY;
        }
        // Save 
        String dom = address.split(AT)[1];
        String[] parts = dom.split(POINT);
        String[] result = new String[parts.length]; // parts und result haben die gleiche Länge
        for (int i = parts.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = parts[i];

        }
        return String.join(".", result);
    }
    
    public static String domain2(String address) {
        if(address == null) {
            return EMPTY;
        }

        List<String> parts = Arrays
            .stream(address.split("@"))
            .skip(1) // Teil vor dem @ weglassen
            .map(dom -> dom.split("\\.")) // . hat eine spezielle Bedeutung als Regex
            .flatMap(Arrays::stream) // flachdrücken
            .collect(Collectors.toList());
            
        Collections.reverse(parts);

        return parts
            .stream()
            .collect(Collectors.joining("."));
    }
}
