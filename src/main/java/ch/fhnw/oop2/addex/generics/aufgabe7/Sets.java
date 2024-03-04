package ch.fhnw.oop2.addex.generics.aufgabe7;

import java.util.HashSet;
import java.util.Set;

public class Sets <A>{

    private Sets(){}

    public static <A> Set<A> of(A... args){
        Set<A> set = new HashSet<>();
        for(A a : args){
            if(!set.add(a)){
                throw new IllegalArgumentException();
            }
        }
        return set;
    }

    /*
    sie prüft, ob jedes Element erfolgreich dem Set hinzugefügt wurde.
    In einem Set ist jedes Element eindeutig, daher wird ein Element nicht hinzugefügt,
    wenn es bereits im Set vorhanden ist. Die Methode add gibt in diesem Fall false zurück.

    Wenn beim Hinzufügen eines Elements zu dem Set false zurückgegeben wird
    (was bedeutet, dass ein Duplikat gefunden wurde), wirft die Methode eine IllegalArgumentException.
    Das bedeutet, dass diese spezielle of-Methode erwartet, dass alle übergebenen Argumente eindeutig sind
    und löst eine Ausnahme aus, wenn dies nicht der Fall ist.
     */





}
