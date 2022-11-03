package com.assignment.org.inheritance2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="dieselcar2")
public class DieselCar2 extends Car2 {



    private Double diesel_price;

    public DieselCar2(){

    }


    public DieselCar2(String owner_name, Double diesel_price) {
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
