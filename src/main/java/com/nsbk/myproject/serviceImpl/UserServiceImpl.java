package com.nsbk.myproject.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsbk.myproject.entities.User;
import com.nsbk.myproject.repositories.UserRepository;
import com.nsbk.myproject.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		
		String uuid = UUID.randomUUID().toString();
		
		user.setId(uuid);
		
		return userRepository.save(user);
	}

	@Override
	public User getSingleUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

}
