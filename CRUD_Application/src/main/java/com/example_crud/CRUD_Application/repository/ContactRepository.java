package com.example_crud.CRUD_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example_crud.CRUD_Application.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
