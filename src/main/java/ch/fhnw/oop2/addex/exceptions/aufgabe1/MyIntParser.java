package ch.fhnw.oop2.addex.exceptions.aufgabe1;

public class MyIntParser {

    private MyIntParser() {}
    public static int parse (String string){
        int resultat = 0;
        try{
            resultat = Integer.parseInt(string);

        } catch (NumberFormatException e){
            e.getMessage();
        }
        return resultat;
    }



}
