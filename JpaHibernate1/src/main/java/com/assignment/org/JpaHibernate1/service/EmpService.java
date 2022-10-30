package com.assignment.org.JpaHibernate1.service;

import com.assignment.org.JpaHibernate1.entity.Employee;
import com.assignment.org.JpaHibernate1.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmpService {

    @Autowired
    EmpRepository repository;

    /*public EmpService(EmpRepository repository){
        this.repository=repository;
    }*/

    public void addOne(Employee employee){
        repository.save(employee);
    }

    public void updateOne(Employee employee){
        repository.save(employee);
    }

    public void delOne(Integer id){
        repository.deleteById(id);
    }

    public List<Employee> showAll(){
        return (List<Employee>)repository.findAll();
    }

    public Integer giveCount(){
        return Math.toIntExact(repository.count());
    }

    public List<Employee> showEmployeeSortedByNameAndAge(){
        return (List<Employee>)repository.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC,"name"),new Sort.Order(null,"age")));
    }

    public Iterable<Employee> showEmployeePaged(int pageNumber){
        Pageable pageable=PageRequest.of(pageNumber,2,Sort.by("name"));
        return repository.findAll(pageable).stream().toList();
    }

    public List<Employee> showByNames(String name){
        return repository.findByName(name);
    }

    public List<Employee> showByStartingA(){
        return repository.findByNameStartingWith("a");
    }

    public List<Employee> showByAgeBetween(){
        return repository.findByAgeBetween(28,32);
    }
}
