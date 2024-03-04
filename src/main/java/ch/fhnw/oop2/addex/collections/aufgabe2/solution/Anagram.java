package ch.fhnw.oop2.addex.collections.aufgabe2.solution;

import java.util.Arrays;

public class Anagram {
    
    public boolean isAnagram(String w1, String w2) {
        
        if(w1 == null || w2 == null) {
            return false;
        }
        
        String[] letters1 = splitLowerCase(w1);
        String[] letters2 = splitLowerCase(w2);
        if(letters1.length != letters2.length) {
            return false;
        }

        Arrays.sort(letters1);
        Arrays.sort(letters2);

        boolean isSame = true;
        for (int i = 0; i < letters1.length; i++) {
            
            if(!letters1[i].equals(letters2[i])) {
                return false;
            }
        }
        // Alternativ könnte man auch eine Stastik der Buchstaben pro Wort mit einer Map machen und
        // dann die Maps miteinander vergleichen.
        return isSame;
    }

    private String[] splitLowerCase(String word) {
        return word.toLowerCase().split("");
    }
}
