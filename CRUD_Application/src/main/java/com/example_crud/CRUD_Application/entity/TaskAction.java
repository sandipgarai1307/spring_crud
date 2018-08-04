package com.example_crud.CRUD_Application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="op_task_action")
public class TaskAction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="task_details")
	private String taskActionDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTaskActionDetails() {
		return taskActionDetails;
	}

	public void setTaskActionDetails(String taskActionDetails) {
		this.taskActionDetails = taskActionDetails;
	}
	

}
