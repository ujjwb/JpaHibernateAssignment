package com.assignment.org.componentmapping.repository;

import com.assignment.org.componentmapping.entity.EmbeddedEmployee;
import org.springframework.data.repository.CrudRepository;

public interface EmbeddedEmployeeRepository extends CrudRepository<EmbeddedEmployee,Integer> {
}
