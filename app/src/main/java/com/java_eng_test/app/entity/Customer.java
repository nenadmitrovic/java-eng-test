package com.java_eng_test.app.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "name", insertable = false, updatable = false)
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "date_created")
	private Timestamp date;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="account_id")
	private Account account;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String email, String address, Timestamp date, Account account) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.date = date;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
	

}
