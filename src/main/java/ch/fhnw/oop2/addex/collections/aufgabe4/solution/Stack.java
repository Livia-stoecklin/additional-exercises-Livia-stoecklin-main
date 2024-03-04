package ch.fhnw.oop2.addex.collections.aufgabe4.solution;

public class Stack {

    private int[] elements;
    private int nextFreeSlot = 0;

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if(nextFreeSlot >= elements.length) {
            grow();
        }
        elements[nextFreeSlot++] = value;
    }

    public int pop() {
        return elements[--nextFreeSlot];
    }

    public int size() {
        return nextFreeSlot;
    }

    private void grow() {
        int[] temp = new int[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
    }
}

