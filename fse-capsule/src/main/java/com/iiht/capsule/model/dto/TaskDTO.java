package com.iiht.capsule.model.dto;

/**
 * Task DTO class
 * 
 * @author Giri
 * @version 1.0
 */
public class TaskDTO {

	private Long taskId;
	private Long parentId;
	private String task;
	private String parentTask;
	private String startDate;
	private String endDate;
	private Integer priority;
	private String taskOpen;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
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
