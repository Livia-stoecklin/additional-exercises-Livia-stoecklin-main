package ch.fhnw.oop2.addex.lambdas.aufgabe5.solution;



public class TestGreeter {

    public static void main(String[] args) {

        HelloJava gruss = System.out::println;
        gruss.hallo("Hallo!");
    }
}
