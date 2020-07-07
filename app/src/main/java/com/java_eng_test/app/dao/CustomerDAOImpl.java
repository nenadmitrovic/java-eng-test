package com.java_eng_test.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java_eng_test.app.entity.Customer;
import com.java_eng_test.app.entity.User;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	private EntityManager entityManager;
	
	@Autowired
	public CustomerDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Customer> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		// create a query
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
		
		List<Customer> customers = theQuery.getResultList();
				
		return customers;
	}

}
