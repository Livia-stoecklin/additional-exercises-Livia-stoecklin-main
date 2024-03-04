package ch.fhnw.oop2.addex.io.util;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Bei JUnit Tests in VS Code ist es nicht möglich den Pfad
 * auf die Ressource direkt anzugeben. Darum existiert diese
 * Hilfsklasse zum Laden von Ressourcen.
 */
public final class ResourceLoader {
    
    private ResourceLoader() {}

    public static Path getResource(Class clazz, String name) {
        try {
            return Paths.get(clazz.getResource(name).toURI());
        }
        catch(URISyntaxException use) {
            use.printStackTrace();
        }
        return Path.of("");
    }
}
