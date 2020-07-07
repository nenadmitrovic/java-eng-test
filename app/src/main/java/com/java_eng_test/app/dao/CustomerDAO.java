package com.java_eng_test.app.dao;

import java.util.List;

import com.java_eng_test.app.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> findAll();

}
