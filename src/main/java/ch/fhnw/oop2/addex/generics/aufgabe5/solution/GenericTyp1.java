package ch.fhnw.oop2.addex.generics.aufgabe5.solution;

public class GenericTyp1 <Q> {

    private Q object;
    
    public GenericTyp1() {
        // empty
    }

    public Q getObject() {
        return object;
    }

    public void setObject(Q object) {
        this.object = object;
    }
}
