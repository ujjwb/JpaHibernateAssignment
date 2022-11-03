package com.assignment.org.jpqlandnative.entity;


import javax.persistence.*;
@Entity
@Table(name="employeetable")
public class Employee {
    @Id
    @Column(name="empid")
    Integer id;
    @Column(name="empfirstname")
    String firstName;
    @Column(name="emplastname")
    String lastName;
    @Column(name="empsalary")
    Double salary;
    @Column(name="empage")
    Integer age;

    public Employee() {
    }

    public Employee(Integer id, String firstName, String lastName, Double salary, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
