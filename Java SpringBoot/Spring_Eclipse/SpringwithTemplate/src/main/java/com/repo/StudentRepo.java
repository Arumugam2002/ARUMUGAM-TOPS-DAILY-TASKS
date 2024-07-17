package com.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.model.Student;
@Component
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
