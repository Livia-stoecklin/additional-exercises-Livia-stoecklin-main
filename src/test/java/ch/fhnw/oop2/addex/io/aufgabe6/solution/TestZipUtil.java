package ch.fhnw.oop2.addex.io.aufgabe6.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

import ch.fhnw.oop2.addex.io.util.ResourceLoader;

public final class TestZipUtil {
    
    @Test
    public void testListZipContents() {
        // when 
        Set<String> paths = ZipUtil.listZipContents(ResourceLoader.getResource(this.getClass(), "test.zip"));

        // then
        assertEquals(7, paths.size());
        assertTrue(paths.contains("/a"));
        assertTrue(paths.contains("/"));
        assertTrue(paths.contains("/a/a.md"));
        assertTrue(paths.contains("/a/b"));
        assertTrue(paths.contains("/a/b/b.md"));
        assertTrue(paths.contains("/a/b/c"));
        assertTrue(paths.contains("/a/b/c/c.md"));
    }
}
