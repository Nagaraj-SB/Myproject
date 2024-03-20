package com.nsbk.myproject.service;

import java.util.List;

import com.nsbk.myproject.entities.User;

public interface UserService {

	User saveUser(User user);

	User getSingleUser(String id);

	List<User> getAllUser();

}
