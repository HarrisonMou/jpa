package com.harrison.jpa.study.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.harrison.jpa.study.dao.UserDao;
import com.harrison.jpa.study.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	@Cacheable(value = "user", key = "targetClass + methodName + #id")
	public User findById(Long id) {
		Optional<User> one = userDao.findById(id);
		return one.orElse(null);
	}

}
