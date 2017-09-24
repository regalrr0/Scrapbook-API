package com.herokuapp.scrapbookr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.herokuapp.scrapbookr.User;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserRepo repo;
	
	@Autowired
	public UserController(UserRepo repo) {
		this.repo = repo;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<User> get(@PathVariable("id") String id) {
		User user = repo.findOne(id);
		if(user == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/new", method= RequestMethod.POST)
	public ResponseEntity<User> update(@RequestBody User user) {
		repo.save(user);
		return get(user.getUserUid());
	}
	
	@RequestMapping
	public List<User> all() {
		return repo.findAll();
	}

}
