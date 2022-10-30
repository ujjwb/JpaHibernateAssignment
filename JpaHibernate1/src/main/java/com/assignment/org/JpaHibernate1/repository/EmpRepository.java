package com.assignment.org.JpaHibernate1.repository;

import com.assignment.org.JpaHibernate1.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmpRepository extends PagingAndSortingRepository<Employee,Integer> {

    List<Employee> findByName(String Name);
    List<Employee> findByNameStartingWith(String Name);
    List<Employee> findByAgeBetween(int startAge,int EndAge);

}
