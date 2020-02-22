package com.govind.springboot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.govind.springboot.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
