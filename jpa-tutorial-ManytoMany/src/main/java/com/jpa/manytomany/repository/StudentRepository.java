package com.jpa.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.manytomany.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
