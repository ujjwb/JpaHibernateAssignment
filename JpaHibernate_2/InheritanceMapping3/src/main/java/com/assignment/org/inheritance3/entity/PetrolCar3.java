package com.assignment.org.inheritance3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@Table(name="petrolcar3")
@PrimaryKeyJoinColumn(name="id")
public class PetrolCar3 extends Car3 {

    private Double petrol_price;

    public PetrolCar3(){}

    public PetrolCar3(String owner_name, Double petrol_price) {
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
