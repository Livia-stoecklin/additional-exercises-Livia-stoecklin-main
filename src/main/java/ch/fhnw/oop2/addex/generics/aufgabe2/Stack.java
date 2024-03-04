package ch.fhnw.oop2.addex.generics.aufgabe2;

/*
Generics anwenden. In einer früheren Übung haben Sie die Klasse Stack für den int-Typ geschrieben.
Schreiben Sie diese Klasse um, so dass Sie für beliebige Typen verwendbar ist.
Verwenden Sie nun eine List statt einem Array zum Speichern der Elemente im innern des Stacks.
 */

public class Stack <T>{

    private int[] elements = new int[100];
    private int nextFreeSlot = 0;

    public void push(int value) {
        elements[nextFreeSlot++] = value;
    }

    public int pop() {
        return elements[--nextFreeSlot];
    }

    public int size() {
        return nextFreeSlot;
    }
}
