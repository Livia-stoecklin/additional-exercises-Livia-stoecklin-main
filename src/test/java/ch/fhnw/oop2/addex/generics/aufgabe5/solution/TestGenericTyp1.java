package ch.fhnw.oop2.addex.generics.aufgabe5.solution;

import org.junit.jupiter.api.Test;

public class TestGenericTyp1 {

    @Test
    public void testStringTypde() {
        // given
        GenericTyp1<String> type1 = new GenericTyp1<>();

        // when, then
        type1.setObject("A");
        // type1.setObject(42); // kompiliert nicht.
    }
}