package ch.fhnw.oop2.addex.collections.aufgabe7.solution;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private float price;

    public Book(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book other) {
        return Float.compare(this.price, other.price);
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Book) {
            Book otherBook = (Book)other;
            return Objects.equals(title, otherBook.title) && 
                Objects.equals(price, otherBook.price);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }
}
