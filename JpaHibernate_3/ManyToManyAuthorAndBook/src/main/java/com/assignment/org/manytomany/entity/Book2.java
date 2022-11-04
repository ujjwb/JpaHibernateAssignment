package com.assignment.org.manytomany.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book2 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer book_id;

    private String book_name;

    private String book_publisher;

    @ManyToMany(mappedBy = "book_list")
    private Set<Author2> author_list;

    public Book2(){

    }

    public Book2(String book_name, String book_publisher) {
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

    public Set<Author2> getAuthor_list() {
        return Set.copyOf(author_list);
    }

    public void setAuthor_list(Set<Author2> author2) {
        this.author_list = author2;
    }

    public void addAuthor(Author2 author){
        if(author!=null){
            if(author_list==null){
                author_list=new HashSet<>();
            }
            author_list.add(author);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book2 book2 = (Book2) o;
        return  Objects.equals(book_name, book2.book_name) && Objects.equals(book_publisher, book2.book_publisher);
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
