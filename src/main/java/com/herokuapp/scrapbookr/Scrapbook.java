package com.herokuapp.scrapbookr;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

import com.google.api.client.googleapis.auth.oauth2.GoogleOAuthConstants;

@Entity
public class Scrapbook {
	
	@Id
	UUID id;
	
	@NotEmpty
	String name;
	
	@NotEmpty
	String creator;
	
	public Scrapbook() {
		// TODO Auto-generated constructor stub
	}

}
