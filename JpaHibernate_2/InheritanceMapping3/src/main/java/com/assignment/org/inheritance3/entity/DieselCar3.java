package com.assignment.org.inheritance3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@Table(name="dieselcar3")
@PrimaryKeyJoinColumn(name="id")
public class DieselCar3 extends Car3 {

    private Double diesel_price;

    public DieselCar3(){}

    public DieselCar3(String owner_name, Double diesel_price) {
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
