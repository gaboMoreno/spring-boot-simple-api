package com.example.springbootsimpleapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootsimpleapi.model.Student;

//@RepositoryRestResource(path = "students")
@Repository
public interface StudentsRepository extends CrudRepository<Student, Integer>{
}
