package com.jpa.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.onetoone.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
