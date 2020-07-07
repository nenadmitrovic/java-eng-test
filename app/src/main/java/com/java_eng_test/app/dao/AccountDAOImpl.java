package com.java_eng_test.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java_eng_test.app.entity.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public AccountDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Account> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		// create a query
		Query<Account> theQuery = currentSession.createQuery("from Account", Account.class);
		
		List<Account> accounts = theQuery.getResultList();
		
		return accounts;
	}

}
