package com.proj.td.model;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TaskID")
	public Long taskID;

	@Column(name = "TaskTittle")
	public String taskTittle;

	@Column(name = "TaskDescription")
	public String taskDescription;

	@Column(name = "TaskCategory")
	public String taskCategory;

	@Column(name = "TaskDueDate")
	public Date taskDueDate;

	@Column(name = "TaskDueTime")
	public Time taskDueTime;

	@Column(name = "TaskStatus")
	public String taskStatus;

	@Column(name = "IsCompleted")
	public boolean isCompleted;

	public Long getTaskID() {
		return taskID;
	}

	public void setTaskID(Long taskID) {
		this.taskID = taskID;
	}

	public String getTaskTittle() {
		return taskTittle;
	}

	public void setTaskTittle(String taskTittle) {
		this.taskTittle = taskTittle;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskCategory() {
		return taskCategory;
	}

	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}

	public Date getTaskDueDate() {
		return taskDueDate;
	}

	public void setTaskDueDate(Date taskDueDate) {
		this.taskDueDate = taskDueDate;
	}

	public Time getTaskDueTime() {
		return taskDueTime;
	}

	public void setTaskDueTime(Time taskDueTime) {
		this.taskDueTime = taskDueTime;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public Task() {
		super();
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Task(Long taskID, String taskTittle, String taskDescription, String taskCategory, Date taskDueDate,
			Time taskDueTime, String taskStatus, boolean isCompleted) {
		super();
		this.taskID = taskID;
		this.taskTittle = taskTittle;
		this.taskDescription = taskDescription;
		this.taskCategory = taskCategory;
		this.taskDueDate = taskDueDate;
		this.taskDueTime = taskDueTime;
		this.taskStatus = taskStatus;
		this.isCompleted = isCompleted;
	}

}
