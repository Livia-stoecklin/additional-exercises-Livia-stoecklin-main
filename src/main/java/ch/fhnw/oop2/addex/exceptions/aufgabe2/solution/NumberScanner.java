package ch.fhnw.oop2.addex.exceptions.aufgabe2.solution;

import java.util.Scanner;

// Es ist schwierig für diesen Use Case einen Testfall zu schreiben.
// Wir geben hier ausnahmsweise einen String zur Konsole aus.

public class NumberScanner {

    private NumberScanner() {}

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        }
        finally {
            System.err.println("closing scanner...");
            scanner.close();
        }
    }

    public static void main(String[] args) {
        int result = NumberScanner.readInt();
        System.out.println(result);
    }
}