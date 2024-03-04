package ch.fhnw.oop2.addex.exceptions.aufgabe3.solution;

public class MyIntParser {
    
    private MyIntParser() {}

    public static int parse(String value) /* throws WrongInputException */{
        try {
            return Integer.parseInt(value);
        }
        catch(NumberFormatException nfe) {
            /*throw new WrongInputException("Input is not a number: " + value); */
        }
        return 0;
    }
}
