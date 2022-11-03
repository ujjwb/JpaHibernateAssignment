package com.assignment.org.inheritance2.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Car2 {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String owner_name;

    public Car2(){}

    public Car2(String owner_name) {
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
