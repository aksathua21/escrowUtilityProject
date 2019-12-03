package com.escrow.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.escrow.domain.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Id> {

}
