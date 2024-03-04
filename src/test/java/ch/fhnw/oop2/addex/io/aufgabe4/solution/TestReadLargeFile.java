package ch.fhnw.oop2.addex.io.aufgabe4.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import ch.fhnw.oop2.addex.io.util.ResourceLoader;

public class TestReadLargeFile {

    private static final long LINE_COUNT_WAR_AND_PEACE = 66030;
    private Path warAndPeace = ResourceLoader.getResource(this.getClass(), "war-and-peace.txt");

    @Test
    public void testWithScannerHasNext() {
        // when
        long time = System.currentTimeMillis();
        long numberOfLines = ReadLinesWithScanner.readWithHasNext(warAndPeace);
        System.out.println("testWithScannerHasNext " + (System.currentTimeMillis() - time));

        // then
        assertEquals(LINE_COUNT_WAR_AND_PEACE, numberOfLines);
    }

    @Test
    public void testWithScannerUseDelimiter() {
        // when
        long time = System.currentTimeMillis();
        long numberOfLines = ReadLinesWithScanner.readWithUseDelimiter(warAndPeace);
        System.out.println("testWithScannerUseDelimiter " + (System.currentTimeMillis() - time));

        // then
        assertEquals(LINE_COUNT_WAR_AND_PEACE, numberOfLines);
    }

    @Test
    public void testWithBufferedReaderReadLine() {
        // when
        long time = System.currentTimeMillis();
        long numberOfLines = ReadLinesWithBufferedReader.readWithReadLine(warAndPeace);
        System.out.println("testWithBufferedReaderReadLine " + (System.currentTimeMillis() - time));

        // then
        assertEquals(LINE_COUNT_WAR_AND_PEACE, numberOfLines);
    }

    @Test
    public void testWithBufferedReaderLines() {
        // when
        long time = System.currentTimeMillis();
        long numberOfLines = ReadLinesWithBufferedReader.readWithLines(warAndPeace);
        System.out.println("testWithBufferedReaderLines " + (System.currentTimeMillis() - time));

        // then
        assertEquals(LINE_COUNT_WAR_AND_PEACE, numberOfLines);
    }
}