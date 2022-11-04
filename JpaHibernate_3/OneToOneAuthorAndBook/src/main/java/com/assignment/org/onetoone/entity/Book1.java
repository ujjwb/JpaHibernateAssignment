package com.assignment.org.onetoone.entity;

import javax.persistence.*;

@Entity
public class Book1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer book_id;

    private String book_name;

    private String book_publisher;

    @OneToOne(mappedBy="book1")
    private Author1 author1;

    public Book1(){

    }

    public Book1(String book_name, String book_publisher) {
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

    public Author1 getAuthor() {
        return author1;
    }

    public void setAuthor(Author1 author1) {
        this.author1 = author1;
    }
}
