package com.assignment.org.onetomany.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Author3 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer author_id;
    private String author_name;
    @OneToMany(mappedBy="author3",cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Book3> book_list;

    public Author3(){
    }

    public Author3(String author_name,Set<Book3> book_list) {
        this.book_list = book_list;
        this.author_name=author_name;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Set<Book3> getBook_list() {
        return Set.copyOf(book_list);
    }

    public void addBook(Book3 book){
        if(book_list==null){
            book_list=new HashSet<>();
        }
        book.setAuthor(this);
        book_list.add(book);
    }
    public void setBook_list(Set<Book3> book_list) {
        this.book_list = book_list;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author3 author3 = (Author3) o;
        return author_id.equals(author3.author_id) && Objects.equals(author_name, author3.author_name) && Objects.equals(book_list, author3.book_list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author_name, book_list);
    }

    @Override
    public String toString() {
        return "Author3{" +
                "author_id=" + author_id +
                ", author_name='" + author_name + '\'' +
                '}';
    }
}
