package com.iiht.capsule.model.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

@Entity
public class ParentTask implements Persistable<Long> {

	@Id
	@GenericGenerator(name = "gen1", strategy = "increment")
	@GeneratedValue(generator = "gen1")
	private Long parentId;

	private String parentTask;

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

	@Override
	public Long getId() {
		return parentId;
	}

	@Override
	public boolean isNew() {
		return (null == parentId);
	}

}
