package com.assignment.org.inheritance1.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("pc")
public class PetrolCar1 extends Car1 {


    private Double petrol_price;

    public PetrolCar1() {
    }

    public PetrolCar1(String owner_name, Double petrol_price) {
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
