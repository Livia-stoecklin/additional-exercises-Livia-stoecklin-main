package ch.fhnw.oop2.addex.streams.aufgabe1.solution;

import java.util.Objects;

public class Farbstift {

    private String farbe;
    private int productId;

    public Farbstift(String farbe, int productId) {
        this.farbe = farbe;
        this.productId = productId;
    }
    
    public String getFarbe() {
        return farbe;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Farbstift) {
            Farbstift s = (Farbstift)other;
            return Objects.equals(productId, s.productId) && Objects.equals(farbe, s.farbe);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, farbe);
    }
}
