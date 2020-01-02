package com.jpa.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.onetomany.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
