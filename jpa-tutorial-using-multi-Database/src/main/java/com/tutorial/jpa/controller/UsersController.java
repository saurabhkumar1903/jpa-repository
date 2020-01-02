package com.tutorial.jpa.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.jpa.dto.Booking;
import com.tutorial.jpa.dto.User;
import com.tutorial.jpa.repository.primary.UserRepository;
import com.tutorial.jpa.repository.secondary.BookingRepository;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersController {

	@Autowired
	@Resource(name = "primary")
	private UserRepository userRepository;

	@Autowired
	@Resource(name = "secondary")
	private BookingRepository bookingRepository;

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

//booking
	@PostMapping(value = "/saveB")
	public Booking saveB(@RequestBody Booking booking) {
		return bookingRepository.save(booking);
	}

	@GetMapping(value = "/fetchB")
	public List<Booking> fetchAllB() {
		return bookingRepository.findAll();
	}

	@GetMapping(value = "/fetchB/{id}")
	public Optional<Booking> fetchByIdB(@PathVariable Integer id) {
		return bookingRepository.findById(id);
	}

	@GetMapping(value = "/fetchByNameB/{name}")
	public List<Booking> fetchByNameB(@PathVariable String name) {
		return bookingRepository.findByName(name);
	}

}
