package com.tutorial.jpa.cmdrunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutorial.jpa.dto.User;
import com.tutorial.jpa.repository.UserRepository;

@Component
public class JpaRepositoryCmdRunner implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	private static final Logger logger = LoggerFactory.getLogger(JpaRepositoryCmdRunner.class);

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("Jpa", "Admin");
		userRepository.save(user1);
		logger.info("New users Created Using SpringData ");

	}

}
