package com.example_crud.CRUD_Application.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example_crud.CRUD_Application.entity.User;
import com.example_crud.CRUD_Application.repository.UserRepository;

@Service
public class UserDao {
	
	@Autowired
	UserRepository userRepo;
	
	
	public User saveUser(User user){
		return userRepo.save(user);
	}
	
	
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
	
	

}
