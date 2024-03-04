package ch.fhnw.oop2.addex.generics.aufgabe5;

public class GenericTyp1 <Q>{
    private Q objekt;

    public GenericTyp1(){
        //Empty
        }

    public Q setObjekt(){
        return objekt;
    }

    public void getObjekt(Q objekt){
        this.objekt = objekt;
    }



}
