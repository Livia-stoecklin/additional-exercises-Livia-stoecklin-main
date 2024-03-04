package ch.fhnw.oop2.addex.collections.aufgabe3.solution;

public class Stack {

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
