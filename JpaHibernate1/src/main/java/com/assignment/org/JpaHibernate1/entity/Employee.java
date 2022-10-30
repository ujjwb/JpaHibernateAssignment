package com.assignment.org.JpaHibernate1.entity;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Column(name="emp_name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer age;
    private String location;

    public Employee(String name,  Integer age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", Location='" + location + '\'' +
                '}';
    }
}
