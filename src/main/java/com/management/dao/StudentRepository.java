package com.management.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	Optional <Student> findByRegisterNo(int registerNo);

}
