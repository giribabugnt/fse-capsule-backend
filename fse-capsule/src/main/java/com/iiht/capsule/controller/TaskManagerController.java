package com.iiht.capsule.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.capsule.model.dto.AddTaskRequest;
import com.iiht.capsule.model.dto.TaskDTO;
import com.iiht.capsule.model.dto.UpdateTaskRequest;
import com.iiht.capsule.service.TaskManagerService;

/**
 * Rest Controller class
 * 
 * @author Giri
 * @version 1.0
 */
@RestController
@RequestMapping("/task-manager/v1")
public class TaskManagerController {

	@Autowired
	private TaskManagerService service;

	@PostMapping("/add-task")
	public ResponseEntity<Object> addTask(@Valid @RequestBody AddTaskRequest addTaskRequest) {

		service.addTask(addTaskRequest);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/update-task")
	public ResponseEntity<Object> updateTask(@Valid @RequestBody UpdateTaskRequest updateTaskRequest) {

		service.updateTask(updateTaskRequest);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/tasks")
	public List<TaskDTO> getTasks() {

		return service.getTasks();
	}
}
