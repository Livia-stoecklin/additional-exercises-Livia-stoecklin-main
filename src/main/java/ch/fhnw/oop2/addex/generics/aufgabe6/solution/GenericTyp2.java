package ch.fhnw.oop2.addex.generics.aufgabe6.solution;

import java.io.Serializable;

public class GenericTyp2 <S extends Serializable> {
    private S object;
    
    public GenericTyp2(S object) {
        this.object = object;
    }

    public S getObject() {
        return object;
    }
}
