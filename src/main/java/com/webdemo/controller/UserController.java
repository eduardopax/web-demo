package com.webdemo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webdemo.entity.User;
import com.webdemo.repository.UserRepository;

@RestController
@RequestMapping("/rest/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/generateRandonUser", method = RequestMethod.GET)
	public ResponseEntity<User> generateRandonUser() {
		User newUser = new User();
		newUser.setName("new user " + System.currentTimeMillis());
		User user = this.userRepository.save(newUser);

		logger.info("User created:" + user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAll() {
		logger.info("get all users requested");
		return new ResponseEntity<List<User>>(this.userRepository.findAll(), HttpStatus.OK);
	}

}
