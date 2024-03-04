package ch.fhnw.oop2.addex.exceptions.aufgabe3;

public class MyIntParser {

    private MyIntParser() {}
    public static int parse (String string) {
        int resultat = 0;
        try{
            resultat = Integer.parseInt(string);

        } catch (NumberFormatException e){

        }
        return resultat;
    }



}
