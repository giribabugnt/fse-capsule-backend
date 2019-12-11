package com.iiht.capsule.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iiht.capsule.model.dao.ParentTask;

/**
 * Repository for PARENT_TASK table
 * 
 * @author Giri
 * @version 1.0
 */
@Repository
public interface ParentTaskRepository extends CrudRepository<ParentTask, Long> {

}
