package ch.fhnw.oop2.addex.exceptions.aufgabe2;

import java.util.Scanner;

public class NumberScanner {

    private NumberScanner() {}

    public static int readInt(){
        Scanner scan = new Scanner(System.in);
        try {
            return scan.nextInt();

        } finally {
            System.err.println("Closing Scanner...");
            scan.close();
        }
    }


    public static void main(String[] args) {
        int result = NumberScanner.readInt();
        System.out.println(result);
    }
}


