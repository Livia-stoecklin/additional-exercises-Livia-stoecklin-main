package ch.fhnw.oop2.addex.generics.aufgabe4;


/*
Generische Methoden. Schreiben Sie eine generische Methode max(a), welche das grösste Element der Liste a zurückgibt.
Die Elemente können von beliebigem Typ sein, müssen aber das Interface Comparable<T> implementiert haben.
 */

import java.util.ArrayList;
import java.util.List;

public class Maxer <T> {

    List<T> list = new ArrayList<>();
    public static <T extends Comparable<T>> T max(List<T> values){
        return values.stream().max((a, b) -> a.compareTo(b)).orElse(null);


    }
}
