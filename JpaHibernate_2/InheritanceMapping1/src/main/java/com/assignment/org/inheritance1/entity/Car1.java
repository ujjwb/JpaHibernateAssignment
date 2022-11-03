package com.assignment.org.inheritance1.entity;

import javax.persistence.*;


@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@Entity
@DiscriminatorColumn(name="fuel_type",discriminatorType = DiscriminatorType.STRING)
public abstract class Car1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String owner_name;

    public Car1() {
    }

    public Car1( String owner_name) {
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
