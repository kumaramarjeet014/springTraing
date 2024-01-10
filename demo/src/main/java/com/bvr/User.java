package com.bvr;

import java.util.Date;

public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer id, String name, Date birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	private Integer id;
	
	private String name;
	
	private Date birthDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return name;
	}

	public void setUser(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date date) {
		this.birthDate = date;
	}

}
