package com.assignment.org.onetoone.entity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer author_id;

    @Embedded
    private Address author_address;

    @ElementCollection
    private List<Subject> subject_list;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="book_id")
    private Book1 book1;

    public Author1(){
    }

    public Author1(Address author_address, List<Subject> subject_list, Book1 book1) {
        this.author_address = author_address;
        this.subject_list = subject_list;
        this.book1 = book1;
    }

    public Integer getAuthor_id() {
        return author_id;
    }


    public Address getAuthor_address() {
        return author_address;
    }

    public void setAuthor_address(Address author_address) {
        this.author_address = author_address;
    }

    public List<Subject> getSubject_list() {
        return List.copyOf(subject_list);
    }

    public void setSubject_list(List<Subject> subject_list) {
        this.subject_list = subject_list;
    }
    public void addSubject(Subject subject){
        if(subject_list ==null){
            subject_list =new ArrayList<>();
        }
        subject_list.add(subject);
    }

    public Book1 getBook() {
        return book1;
    }

    public void setBook(Book1 book1) {
        this.book1 = book1;
    }
}
