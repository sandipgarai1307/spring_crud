package com.example_crud.CRUD_Application.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="op_task")
public class Tasks {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="created_at")
	private Date createdAt=new Date();
	
	@Column(name="user_id_FK", nullable=false)
	Long userIdFK;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id_FK", referencedColumnName="id", insertable=false, updatable=false)
	private User userId;
	
	@Column(name="task_title")
	private String taskTitle;
	
	@Column(name="task_details")
	private String taskDetails;
	
	
	Tasks(){}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Long getUserIdFK() {
		return userIdFK;
	}


	public void setUserIdFK(Long userIdFK) {
		this.userIdFK = userIdFK;
	}


	public User getUserId() {
		return userId;
	}


	public void setUserId(User userId) {
		this.userId = userId;
	}


	public String getTaskTitle() {
		return taskTitle;
	}


	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}


	public String getTaskDetails() {
		return taskDetails;
	}


	public void setTaskDetails(String taskDetails) {
		this.taskDetails = taskDetails;
	}
	
	

	
}
