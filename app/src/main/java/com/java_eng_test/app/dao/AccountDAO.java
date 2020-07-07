package com.java_eng_test.app.dao;

import java.util.List;

import com.java_eng_test.app.entity.Account;

public interface AccountDAO {
	
	public List<Account> findAll();

}
