package com.java_eng_test.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java_eng_test.app.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public UserDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<User> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		// create a query
		Query<User> theQuery = currentSession.createQuery("from User", User.class);
		
		List<User> users = theQuery.getResultList();
				
		return users;
	}

}
