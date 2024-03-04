package ch.fhnw.oop2.addex.generics.aufgabe1;

/*
Vergleiche. Implementieren Sie eine statische generische Methode diff(s1, s2). Der generische Typ soll das
Comparable-Interface implementieren. Die Methode liefert die folgende Werte:
Eine negative Zahl, wenn s1 < s2
0 wenn, s1 == s2
Eine positive Zahl, wenn s1 > s2
 */

import java.security.Key;

public class Differ {
    private Differ(){ } //Konstruktor

    public static <T extends Comparable<T>> int diff(T s1, T s2){
        return s1.compareTo(s2);
    }


}
