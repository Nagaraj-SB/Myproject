package com.nsbk.myproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsbk.myproject.entities.User;
import com.nsbk.myproject.service.UserService;

@RestController
@RequestMapping("/my-service")
public class Controller {

	@Autowired
	UserService userService;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {

		User user1 = userService.saveUser(user);

		return ResponseEntity.status(HttpStatus.CREATED).body(user1);

	}

}
