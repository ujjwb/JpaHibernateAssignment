package com.assignment.org.jpqlandnative.repository;


import com.assignment.org.jpqlandnative.entity.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface EmpRepository extends CrudRepository<Employee,Integer> {

    @Query("from Employee")
    public List<Employee> findAllEmp();

    @Query("select firstName, lastName from Employee")
    public List<Object[]> findNamesOFEmployees();

    @Query("from Employee where firstName=:firstName")
    public List<Employee> findEmployeesByName(@Param("firstName") String firstName);

    @Query("select e.firstName,e.lastName from Employee e where e.salary>:avgsalary")
    public List<Object[]> jpqlQues1(@Param("avgsalary")Double avgsalary, Sort sort);

    @Modifying
    @Query("update Employee e set e.salary=:salary where e.salary<:avgsalary" )
    public void jpqlQues2(@Param("salary") Double salary,@Param("avgsalary") Double avgsalary);

    @Modifying
    @Query("delete from Employee e where e.salary=:minsalary")
    public Object jpqlQues3(@Param("minsalary") Double minSalary);

    @Query("select min(e.salary) from Employee e")
    public Double findMinSalary();


    @Query("select avg(e.salary) from Employee e")
    public Double findAvgSalary();

    //Native
    @Query(value="select e.empid,e.empfirstname,e.empage from employeetable e where e.emplastname like '%Singh'", nativeQuery = true)
    public List<Object[]> nativeQueryQues1();

    @Modifying
    @Query(value="delete * from employeetable e where e.empage> :age", nativeQuery = true)
    public void nativeQueryQues2(@Param("age") Integer age);
}
