package com.assignment.org.inheritance3.entity;

import javax.persistence.*;


@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@Entity
public abstract class Car3 {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String owner_name;

    public Car3(){}

    public Car3(String owner_name) {
        this.id = id;
        this.owner_name = owner_name;
    }

    public Integer getId() {
        return id;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }
}
