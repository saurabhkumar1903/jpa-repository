package com.tutorial.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.jpa.dto.User;
import com.tutorial.jpa.repository.UserRepository;

@RestController
@RequestMapping(value="/rest/users")
public class UsersController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping(value = "/save")
	public User save(@RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping(value = "/fetch")
	public List<User> fetchAll() {
		return userRepository.findAll();
	}

	@GetMapping(value = "/fetch/{id}")
	public Optional<User> fetchById(@PathVariable Integer id) {
		return userRepository.findById(id);
	}

	@GetMapping(value = "/fetchByName/{name}")
	public List<User> fetchByName(@PathVariable String name) {
		return userRepository.findByName(name);
	}

}
