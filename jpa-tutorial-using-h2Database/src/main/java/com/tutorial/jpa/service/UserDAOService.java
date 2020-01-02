package com.tutorial.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tutorial.jpa.dto.User;

@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public long insertUser(User user)
	{
		entityManager.persist(user);
		return user.getId();
	}
	
}
