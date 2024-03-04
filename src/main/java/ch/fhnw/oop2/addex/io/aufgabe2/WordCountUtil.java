package ch.fhnw.oop2.addex.io.aufgabe2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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
		try {
			return Files.readAllLines(path);
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return new ArrayList<>();
	}
}
