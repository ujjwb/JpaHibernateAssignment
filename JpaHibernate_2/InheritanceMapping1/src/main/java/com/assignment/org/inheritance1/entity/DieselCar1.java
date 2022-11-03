package com.assignment.org.inheritance1.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("dc")
public class DieselCar1 extends Car1 {


    private Double diesel_price;

    public DieselCar1(){

    }

    public DieselCar1(String owner_name, Double diesel_price) {
        super(owner_name);
        this.diesel_price = diesel_price;
    }

    public Double getDiesel_price() {
        return diesel_price;
    }

    public void setDiesel_price(Double diesel_price) {
        this.diesel_price = diesel_price;
    }
}
