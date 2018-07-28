package com.example_crud.CRUD_Application.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example_crud.CRUD_Application.repository.AddressRepository;

@Service
public class AddressDao {
	@Autowired
	AddressRepository addressRepo;
	
}
