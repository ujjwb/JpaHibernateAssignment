package com.assignment.org.componentmapping.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmbeddedEmployee {
    @Id
    private Integer id;
    private String empName;
    @Embedded
    private Address address;

    public EmbeddedEmployee(){

    }
    public EmbeddedEmployee(Integer id, String empName, Address address) {
        this.id = id;
        this.empName = empName;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
