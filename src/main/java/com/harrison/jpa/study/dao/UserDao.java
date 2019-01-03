package com.harrison.jpa.study.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harrison.jpa.study.domain.User;

public interface UserDao extends JpaRepository<User, Long>{
	
}
