package com.iiht.capsule.model.dto;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Update Task Request DTO class
 * 
 * @author Giri
 * @version 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateTaskRequest {

	@NotNull
	private Long taskId;

	@NotNull
	private String task;

	@NotNull
	private Long parentId;

	@NotNull
	private String parentTask;

	@NotNull
	private String startDate;

	@NotNull
	private String endDate;

	@NotNull
	private Integer priority;

	@NotNull
	private String taskOpen;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getParentTask() {
		return parentTask;
	}

	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getTaskOpen() {
		return taskOpen;
	}

	public void setTaskOpen(String taskOpen) {
		this.taskOpen = taskOpen;
	}

}
