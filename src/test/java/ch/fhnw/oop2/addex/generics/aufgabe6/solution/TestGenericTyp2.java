package ch.fhnw.oop2.addex.generics.aufgabe6.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestGenericTyp2 {

    @Test
    public void testWithString() {
        // given
        final String A = "A";
        GenericTyp2<String> strings = new GenericTyp2<>(A);

        // when
        String result = strings.getObject();
        
        // then
        assertEquals(A, result);
    }

    @Test
    public void testWithSerializable() {
        // given
        final MySerializable a = new MySerializable();
        GenericTyp2<MySerializable> strings = new GenericTyp2<>(a);

        // when
        MySerializable result = strings.getObject();
        
        // then
        assertEquals(a, result);
    }

    @Test
    public void testWithNonSerializable() {
        // given - kompiliert nicht, da Object Serializable nicht implementiert.
        // GenericTyp2<Object> strings = new GenericTyp2<>(new Object());
    }
}
