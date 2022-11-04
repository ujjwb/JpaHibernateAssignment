package com.assignment.org.onetomany.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Book3 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer book_id;

    private String book_name;

    private String book_publisher;

    @ManyToOne()
    @JoinColumn(name="author_id")
    private Author3 author3;

    public Book3(){

    }

    public Book3(String book_name, String book_publisher) {
        this.book_name = book_name;
        this.book_publisher = book_publisher;
    }

    public Integer getBook_id() {
        return book_id;
    }



    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_publisher() {
        return book_publisher;
    }

    public void setBook_publisher(String book_publisher) {
        this.book_publisher = book_publisher;
    }

    public Author3 getAuthor() {
        return author3;
    }

    public void setAuthor(Author3 author3) {
        this.author3 = author3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book3 book3 = (Book3) o;
        return  Objects.equals(book_name, book3.book_name) && Objects.equals(book_publisher, book3.book_publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book_name, book_publisher);
    }

    @Override
    public String toString() {
        return "Book3{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_publisher='" + book_publisher + '\'' +
                '}';
    }
}
