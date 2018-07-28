package com.example_crud.CRUD_Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example_crud.CRUD_Application.dao.UserDao;
import com.example_crud.CRUD_Application.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user){
		return userDao.saveUser(user);
	}
	
	@GetMapping("/all")
	public List<User> getAllUser(){
		return userDao.getAllUser();
	}
}
