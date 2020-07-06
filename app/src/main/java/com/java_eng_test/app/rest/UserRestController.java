package com.java_eng_test.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java_eng_test.app.dao.UserDAO;
import com.java_eng_test.app.entity.User;

@RestController
@RequestMapping("/api")
public class UserRestController {
	
	private UserDAO userDAO;
	@Autowired
	public UserRestController(UserDAO theUserDAO) {
		userDAO = theUserDAO;
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userDAO.findAll();
	}
	
	

}
