package ch.fhnw.oop2.addex.io.aufgabe2.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hilfsklasse. Enthält Operationen für das Zählen von Wörtern in Dateien.
 *
 */
public final class WordCountUtil {

    private WordCountUtil() {}

	/**
	 * Liest alle Zeilen einer Datei. Tritt ein Fehler auf, wird abgebrochen und
	 * eine leere Liste zurückgegeben.
	 * 
	 * @param path Die Datei, welche gelesen wird
	 * @return Die Liste der Zeilen in der Datei
	 */
	public static List<String> readAllLines(Path path) {
        // close the ressources with try-with
        try(BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(Files.newInputStream(path)))) {
            // or Files.newBufferedReader(path)
            return reader
                .lines()
                //.skip(1) // skip header, if one
                .collect(Collectors.toList());
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
            return List.of();
        }
	}
}
