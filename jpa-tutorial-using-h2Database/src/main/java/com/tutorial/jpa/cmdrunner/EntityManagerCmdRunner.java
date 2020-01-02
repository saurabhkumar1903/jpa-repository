package com.tutorial.jpa.cmdrunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutorial.jpa.dto.User;
import com.tutorial.jpa.service.UserDAOService;

@Component
public class EntityManagerCmdRunner implements CommandLineRunner {

	@Autowired
	private UserDAOService userDAOService;

	private static final Logger logger = LoggerFactory.getLogger(EntityManagerCmdRunner.class);

	@Override
	public void run(String... args) throws Exception {

		User user = new User("Entity", "Admin");
		long result = userDAOService.insertUser(user);
		logger.info("NEw USer Created using EntityManager id :{}", result);

	}

}
