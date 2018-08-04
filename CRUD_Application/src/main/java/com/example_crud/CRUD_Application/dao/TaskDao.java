package com.example_crud.CRUD_Application.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example_crud.CRUD_Application.entity.Tasks;
import com.example_crud.CRUD_Application.repository.TaskRepository;

@Service
public class TaskDao {
	
	@Autowired
	TaskRepository taskRepo;
	
	public Tasks saveTask(Tasks task){
		return taskRepo.save(task);
	}
	
	public List<Tasks> getAllTask(){
		return taskRepo.findAll();
	}

}
