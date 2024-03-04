package ch.fhnw.oop2.addex.exceptions.aufgabe1.solution;

public class MyIntParser {
    
    private MyIntParser() {}

    public static int parse(String value) {
        int result = 0;
        try {
            result = Integer.parseInt(value);
        }
        catch(NumberFormatException nfe) {
            // ignore
        }
        return result;
    }
}
