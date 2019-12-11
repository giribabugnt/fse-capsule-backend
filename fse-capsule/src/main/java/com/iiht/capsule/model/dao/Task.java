package com.iiht.capsule.model.dao;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

/**
 * Task table
 * 
 * @author Giri
 * @version 1.0
 */
@Entity
@DynamicUpdate
public class Task implements Persistable<Long> {

	@Id
	@GenericGenerator(name = "gen2", strategy = "increment")
	@GeneratedValue(generator = "gen2")
	private Long taskId;

	private String task;
	private LocalDate startDate;
	private LocalDate endDate;
	private Integer priority;
	private String taskOpen;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "parent_id")
	private ParentTask parentTask;

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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
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

	public ParentTask getParentTask() {
		return parentTask;
	}

	public void setParentTask(ParentTask parentTask) {
		this.parentTask = parentTask;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public Long getId() {
		return taskId;
	}

	@Override
	public boolean isNew() {
		return (null == taskId);
	}
}
