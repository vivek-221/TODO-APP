package com.proj.td.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proj.td.model.Task;
import com.proj.td.service.ToDoService;

@RestController
public class ToDoController {

	@Autowired
	private ToDoService toDoService;

	@PostMapping(value = "/createTask")
	public ResponseEntity<Task> addTask(@RequestBody Task task) {
		Task createdTask = toDoService.createTask(task);
		return ResponseEntity.ok(createdTask);
	}

}
