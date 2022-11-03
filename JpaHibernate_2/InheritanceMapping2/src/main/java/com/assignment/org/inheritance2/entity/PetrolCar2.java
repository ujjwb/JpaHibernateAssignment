package com.assignment.org.inheritance2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class PetrolCar2 extends Car2 {


    private Double petrol_price;

    public PetrolCar2(){}


    public PetrolCar2(String owner_name, Double petrol_price) {
        super(owner_name);
        this.petrol_price = petrol_price;
    }

    public Double getPetrol_price() {
        return petrol_price;
    }

    public void setPetrol_price(Double petrol_price) {
        this.petrol_price = petrol_price;
    }
}
