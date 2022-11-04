package com.assignment.org.onetoone.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private Integer street_number;
    private String location;
    private String state;

    public Address(){}

    public Address(Integer street_number, String location, String state) {
        this.street_number = street_number;
        this.location = location;
        this.state = state;
    }

    public Integer getStreet_number() {
        return street_number;
    }

    public void setStreet_number(Integer street_number) {
        this.street_number = street_number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + street_number +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
