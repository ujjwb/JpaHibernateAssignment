package com.assignment.org.componentmapping.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String cityName;
    private String streetName;
    private String stateName;

    public Address(){

    }
    public Address(String cityName, String streetName, String stateName) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
