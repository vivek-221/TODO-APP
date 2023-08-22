package com.proj.td.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.td.exception.TaskNotFoundException;
import com.proj.td.model.Task;
import com.td.proj.repo.TaskRepository;

@Service
public class ToDoService {

	@Autowired
	private TaskRepository taskRepository;

	public Task createTask(Task task) {

		return taskRepository.save(task);
	}

	public Task updateTask(Task task, Long taskId) throws TaskNotFoundException {

		Task updatedTask = null;
		try {
			updatedTask = taskRepository.findById(taskId).orElseThrow(
					() -> new TaskNotFoundException("Task not found with id " + taskId + " to update to the list"));
			updatedTask.setTaskTittle(task.getTaskTittle());
			updatedTask.setTaskDescription(task.getTaskDescription());
			updatedTask.setTaskCategory(task.getTaskCategory());
			updatedTask.setTaskDueDate(task.getTaskDueDate());
			updatedTask.setTaskDueTime(task.getTaskDueTime());
			updatedTask.setTaskStatus(task.getTaskStatus());
			updatedTask.setCompleted(task.isCompleted());

		} catch (TaskNotFoundException e) {
			throw new TaskNotFoundException("Mentioned task fields are empty to update to the list");
		}
		return taskRepository.save(updatedTask);
	}

	public void deleteTask(Long taskId) throws TaskNotFoundException {

		Task task = taskRepository.findById(taskId).orElseThrow(
				() -> new TaskNotFoundException("Task not found with id " + taskId + " to delete from the list"));
		taskRepository.delete(task);
	}
	
	public List<Task> getAllTasks() {
		List<Task> tasks = new ArrayList<>();
		taskRepository.findAll().forEach(tasks::add);
		return tasks;
	}

	public Optional<Task> getTaskById(Long taskId) {
		Optional<Task> task = taskRepository.findById(taskId);
		return task;
	}

}
