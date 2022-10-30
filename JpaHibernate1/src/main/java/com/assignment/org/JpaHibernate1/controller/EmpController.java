package com.assignment.org.JpaHibernate1.controller;

import com.assignment.org.JpaHibernate1.entity.Employee;
import com.assignment.org.JpaHibernate1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    @GetMapping("/emps")
    public List<Employee> showAll() {
        return empService.showAll();
    }

    @PostMapping("/emps")
    public void addEmployee(@RequestBody Employee employee){
        empService.addOne(employee);
    }

    @DeleteMapping("/emps/{id})")
    public void delEmployee(@PathVariable Integer id){
        empService.delOne(id);
    }

    @PutMapping("/emps")
    public void putEmployee(@RequestBody Employee employee){
        empService.updateOne(employee);
    }

    @GetMapping("/emps/count")
    public String countEmployee(){
        return "No. of Employees: "+empService.giveCount();
    }

    @GetMapping("/emps/sorted")
    public List<Employee> showSorted(){
        return empService.showEmployeeSortedByNameAndAge();
    }

    @GetMapping("/emps/paged")
    public List<Employee> showPagedAndSorted(){
        return empService.showEmployeePaged(1);
    }

    @GetMapping("/emps/{name}")
    public List<Employee> showByNamess(@PathVariable String name){
        return empService.showByNames(name);
    }

    @GetMapping("/emps/a")
    public List<Employee> showNamesStartingWithA(){
        return empService.showByStartingA();
    }

    @GetMapping("/emps/age")
    public List<Employee> showBetweenGivenAge(){
        return empService.showByAgeBetween();
    }

}
