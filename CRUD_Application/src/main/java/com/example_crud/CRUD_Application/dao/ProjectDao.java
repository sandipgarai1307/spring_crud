package com.example_crud.CRUD_Application.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example_crud.CRUD_Application.entity.Project;
import com.example_crud.CRUD_Application.repository.ProjectRepository;

@Service
public class ProjectDao {
	@Autowired
	ProjectRepository projectRepo;
	
	public Project saveProject(Project project){
		return projectRepo.save(project);
	}
	
	
	public List<Project> getAllProject(){
		return projectRepo.findAll();
	}
}
