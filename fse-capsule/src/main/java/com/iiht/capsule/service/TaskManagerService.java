package com.iiht.capsule.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.capsule.model.dao.Task;
import com.iiht.capsule.model.dto.AddTaskRequest;
import com.iiht.capsule.model.dto.TaskDTO;
import com.iiht.capsule.model.dto.UpdateTaskRequest;
import com.iiht.capsule.repository.ParentTaskRepository;
import com.iiht.capsule.repository.TaskRepository;

/**
 * Task Manager service class
 * 
 * @author Giri
 * @version 1.0
 */
@Service
public class TaskManagerService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ParentTaskRepository parentRepository;

	@Autowired
	private TaskRepository taskRepository;

	public void addTask(final AddTaskRequest addTaskRequest) {

		Task task = modelMapper.map(addTaskRequest, Task.class);
		parentRepository.save(task.getParentTask());
		taskRepository.save(task);
	}

	public void updateTask(final UpdateTaskRequest updateTaskRequest) {
		
		Task task = modelMapper.map(updateTaskRequest, Task.class);
		parentRepository.save(task.getParentTask());
		taskRepository.save(task);
	}

	public List<TaskDTO> getTasks() {
		List<Task> tasks = (List<Task>) taskRepository.findAll();

		return tasks.stream().map(task -> {
			return modelMapper.map(task, TaskDTO.class);
		}).collect(Collectors.toList());
	}
}
