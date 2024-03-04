package ch.fhnw.oop2.addex.io.aufgabe6.solution;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Eine ZIP Utility Klasse.
 */
public final class ZipUtil {
    
    private ZipUtil() {}

    public static Set<String> listZipContents(Path zipFile) {
        final String root = "/";
        try(Stream<Path> paths = Files.walk(FileSystems.newFileSystem(zipFile).getPath(root))) {
            return paths
                .map(Path::toString)
                .collect(Collectors.toSet());
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return Set.of();
    }
}
