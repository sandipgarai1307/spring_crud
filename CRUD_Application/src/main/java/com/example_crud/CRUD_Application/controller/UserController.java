package com.example_crud.CRUD_Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example_crud.CRUD_Application.dao.ProjectDao;
import com.example_crud.CRUD_Application.dao.TaskDao;
import com.example_crud.CRUD_Application.dao.UserDao;
import com.example_crud.CRUD_Application.entity.Project;
import com.example_crud.CRUD_Application.entity.Tasks;
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
	
	
	// ==================================== TASK SECTION =============================
	@Autowired
	TaskDao taskDao;
	
	@PostMapping("/save-task")
	public Tasks saveTask(@RequestBody Tasks task){
		return taskDao.saveTask(task);
	}
	
	@GetMapping("/get-tasks")
	public List<Tasks> getAllTasks(){
		return taskDao.getAllTask();
	}
	
	
	
	//==================================== PROJECT SECTION =============================
	@Autowired
	ProjectDao projectDao;
	
	@PostMapping("/save-project")
	public Project saveProject(@RequestBody Project project){
		return projectDao.saveProject(project);
	}
	
	public List<Project> getAllProject(){
		return projectDao.getAllProject();
	}
	
	
}
