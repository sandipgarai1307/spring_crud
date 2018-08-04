package com.example_crud.CRUD_Application.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example_crud.CRUD_Application.repository.ContactRepository;

@Service
public class ContactDao {
	@Autowired
	ContactRepository contactRepo;
}
