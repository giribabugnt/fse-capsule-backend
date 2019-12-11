package com.iiht.capsule.model.map;

import java.time.LocalDate;

import org.modelmapper.Converter;
import org.modelmapper.PropertyMap;

import com.iiht.capsule.model.dao.Task;
import com.iiht.capsule.model.dto.UpdateTaskRequest;
import com.iiht.capsule.model.map.converter.LocalDateConverter;

/**
 * UpdateTaskRequest to Task mapping class
 * 
 * @author Giri
 * @version 1.0
 */
public class UpdateTaskRequestToTaskMap extends PropertyMap<UpdateTaskRequest, Task> {

	@Override
	protected void configure() {

		map().setTaskId(source.getTaskId());
		map().setTask(source.getTask());
		map().setPriority(source.getPriority());
		map().setTaskOpen(source.getTaskOpen());

		Converter<String, LocalDate> dateConv = new LocalDateConverter();
		using(dateConv).map(source.getStartDate()).setStartDate(null);
		using(dateConv).map(source.getEndDate()).setEndDate(null);

		map().getParentTask().setParentId(source.getParentId());
		map().getParentTask().setParentTask(source.getParentTask());
	}

}
