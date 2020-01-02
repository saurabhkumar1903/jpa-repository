package com.jpa.manytomany.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.manytomany.model.Student;
import com.jpa.manytomany.repository.StudentRepository;

@RestController
@RequestMapping(value = "/movieinfo")
public class UserController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping(value = "/{id}")
	public Optional<Student> findById(@PathVariable("id") int id) {
		return studentRepository.findById(id);
	}

	@GetMapping(value = "/all")
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@PostMapping(value = "/saving")
	public Student save(@RequestBody Student user) {
		return studentRepository.save(user);
	}

}
