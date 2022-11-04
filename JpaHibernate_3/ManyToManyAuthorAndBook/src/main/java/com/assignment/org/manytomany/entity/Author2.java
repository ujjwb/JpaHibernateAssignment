package com.assignment.org.manytomany.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author2 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer author_id;
    private String author_name;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="authors_books",joinColumns = @JoinColumn(name="author_id",referencedColumnName = "author_id"),
            inverseJoinColumns = @JoinColumn(name="book_id",referencedColumnName = "book_id"))
    private Set<Book2> book_list;

    public Author2(){
    }

    public Author2(String author_name, Set<Book2> book_list) {
        this.book_list = book_list;
        this.author_name=author_name;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Set<Book2> getBook_list() {
        return Set.copyOf(book_list);
    }

    public void addBook(Book2 book){
        if(book!=null){
            if(book_list==null){
                book_list=new HashSet<>();
            }
            book_list.add(book);
        }
    }
    public void setBook_list(Set<Book2> book_list) {
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
        Author2 author2 = (Author2) o;
        return author_id.equals(author2.author_id) && Objects.equals(author_name, author2.author_name) && Objects.equals(book_list, author2.book_list);
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
