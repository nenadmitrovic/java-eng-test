package com.java_eng_test.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java_eng_test.app.dao.AccountDAO;
import com.java_eng_test.app.dao.CustomerDAO;
import com.java_eng_test.app.dao.UserDAO;
import com.java_eng_test.app.entity.Account;
import com.java_eng_test.app.entity.Customer;
import com.java_eng_test.app.entity.User;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
	
	private UserDAO userDAO;
	private AccountDAO accountDAO;
	private CustomerDAO customerDAO;
	
	@Autowired
	public RestController(UserDAO theUserDAO, AccountDAO theAccountDAO, CustomerDAO theCustomerDAO) {
		userDAO = theUserDAO;
		accountDAO = theAccountDAO;
		customerDAO = theCustomerDAO;
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userDAO.findAll();
	}
	
	@GetMapping("/accounts")
	public List<Account> getAccounts() {
		return accountDAO.findAll();
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerDAO.findAll();
	}
	
	

}
