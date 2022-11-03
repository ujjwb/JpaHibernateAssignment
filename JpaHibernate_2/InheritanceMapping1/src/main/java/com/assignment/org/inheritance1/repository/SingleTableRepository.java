package com.assignment.org.inheritance1.repository;

import com.assignment.org.inheritance1.entity.Car1;
import org.springframework.data.repository.CrudRepository;

public interface SingleTableRepository extends CrudRepository<Car1,Integer> {
}
