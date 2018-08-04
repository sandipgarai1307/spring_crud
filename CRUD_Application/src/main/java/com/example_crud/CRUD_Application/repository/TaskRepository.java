package com.example_crud.CRUD_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example_crud.CRUD_Application.entity.Tasks;

public interface TaskRepository extends JpaRepository<Tasks,Long> {

}
