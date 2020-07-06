package com.java_eng_test.app.dao;

import java.util.List;

import com.java_eng_test.app.entity.User;

public interface UserDAO {
	
	public List<User> findAll();

}
