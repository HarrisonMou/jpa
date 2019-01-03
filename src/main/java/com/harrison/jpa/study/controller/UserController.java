package com.harrison.jpa.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harrison.jpa.study.domain.User;
import com.harrison.jpa.study.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/find")
	public User findById(@RequestParam("id") Long id) {
		return userService.findById(id);
	}
}
