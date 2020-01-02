package com.tutorial.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.jpa.dto.User;

@Repository
public interface BookingRepository extends JpaRepository<User,Integer>{
	
	public List<User> findByName(String name);

}
