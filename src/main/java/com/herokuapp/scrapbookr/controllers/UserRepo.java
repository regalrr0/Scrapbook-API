package com.herokuapp.scrapbookr.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.herokuapp.scrapbookr.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

}
