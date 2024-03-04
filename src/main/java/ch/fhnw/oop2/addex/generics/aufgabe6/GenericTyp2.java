package ch.fhnw.oop2.addex.generics.aufgabe6;

import ch.fhnw.oop2.addex.generics.aufgabe5.GenericTyp1;

import java.io.Serializable;

public class GenericTyp2 <S extends Serializable>{

    private S objekt;

    public GenericTyp2(S object) {
        this.objekt = object;
    }

    public S getObjekt(){
        return objekt;
    }


}
