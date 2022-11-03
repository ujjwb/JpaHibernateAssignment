package com.assignment.org.inheritance3.repository;


import com.assignment.org.inheritance3.entity.Car3;
import org.springframework.data.repository.CrudRepository;

public interface JoinedRepository extends CrudRepository<Car3,Integer> {
}
