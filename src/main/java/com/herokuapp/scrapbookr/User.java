package com.herokuapp.scrapbookr;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {

	@Id
	String userUid;
	
	@NotEmpty
	String name;

	@NotEmpty
	String email;
	
	public User(String userUid, String name, String email) {
		this.userUid = userUid;
		this.name = name;
		this.email = email;
	}
	
	public String getUserUid() {
		return userUid;
	}

	public void setUserUid(String userUid) {
		this.userUid = userUid;
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

}
