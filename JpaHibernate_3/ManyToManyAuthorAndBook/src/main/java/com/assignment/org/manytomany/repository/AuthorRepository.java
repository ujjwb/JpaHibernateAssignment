package com.assignment.org.manytomany.repository;


import com.assignment.org.manytomany.entity.Author2;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author2,Integer> {
}
