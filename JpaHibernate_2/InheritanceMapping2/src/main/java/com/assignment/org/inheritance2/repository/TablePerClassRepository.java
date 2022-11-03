package com.assignment.org.inheritance2.repository;


import com.assignment.org.inheritance2.entity.Car2;
import org.springframework.data.repository.CrudRepository;

public interface TablePerClassRepository extends CrudRepository<Car2,Integer> {
}
