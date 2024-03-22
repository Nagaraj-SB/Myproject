package com.nsbk.myproject.serviceImpl;

import java.util.UUID;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.nsbk.myproject.entities.User;
import com.nsbk.myproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User saveUser(User user) {

		String uuid = UUID.randomUUID().toString();

		user.setId(uuid);
		user.setName(user.getName());
		user.setEmail(user.getEmail());
		user.setMobileNo(user.getMobileNo());

		System.out.println(user.toString());

		logger.info("output : {} ", user);

		return user;
	}

}
