package ch.fhnw.oop2.addex.io.aufgabe4.solution;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Klasse mit Utility-Methoden zum Lesen von Zeilen aus
 * einer Datei. Diese Klasse braucht einen Scanner
 * zum Lesen.
 */
public final class ReadLinesWithScanner {

    private ReadLinesWithScanner() {}

    public static long readWithHasNext(Path path) {
        long lineCount = 0;
        try(Scanner scanner = new Scanner(path)) {
            while(scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return lineCount;
    }

    public static long readWithUseDelimiter(Path path) {
        final String newLine = "\n";
        try(Scanner scanner = new Scanner(path).useDelimiter(newLine)) {
            return scanner
                .tokens()
                .map(line -> line) // 
                .count();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return 0L;
    }
}