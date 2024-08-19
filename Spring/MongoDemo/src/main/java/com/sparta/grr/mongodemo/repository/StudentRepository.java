package com.sparta.grr.mongodemo.repository;

import com.sparta.grr.mongodemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer> {
}
