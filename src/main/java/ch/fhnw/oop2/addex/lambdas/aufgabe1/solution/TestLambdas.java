package ch.fhnw.oop2.addex.lambdas.aufgabe1.solution;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class TestLambdas {
    
    public static void main(String[] args) {

        Consumer<Tomato> tomato = a -> { System.out.println(a); };
        tomato.accept(new Tomato());

        BiConsumer<String, Integer> biConsumer = (a, b) -> {
            System.out.println(a + b);
        };
        biConsumer.accept("Hallo ", 42);

        Supplier<Boolean> supplier = () -> true;
        System.out.println("Ich bin eine Supplier: " + supplier.get());

        UnaryOperator<Integer> unary = a -> a * a;
        System.out.println("Das Quadrat von 4: " + unary.apply(4));

        Function<String, Boolean> func = a -> a.length() % 2 != 0;
        System.out.println("Hallo hat eine ungerade Anzahl von Buchstaben: " + func.apply("Hallo"));
    }
}
