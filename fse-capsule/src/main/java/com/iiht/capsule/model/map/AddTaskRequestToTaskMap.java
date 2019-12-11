package com.iiht.capsule.model.map;

import java.time.LocalDate;

import org.modelmapper.Converter;
import org.modelmapper.PropertyMap;

import com.iiht.capsule.model.dao.Task;
import com.iiht.capsule.model.dto.AddTaskRequest;
import com.iiht.capsule.model.map.converter.LocalDateConverter;

/**
 * AddTaskRequest to Task mapping class
 * 
 * @author Giri
 * @version 1.0
 */
public class AddTaskRequestToTaskMap extends PropertyMap<AddTaskRequest, Task> {

	@Override
	protected void configure() {

		map().setTask(source.getTask());
		map().setPriority(source.getPriority());
		map().setTaskOpen(source.getTaskOpen());

		Converter<String, LocalDate> dateConv = new LocalDateConverter();
		using(dateConv).map(source.getStartDate()).setStartDate(null);
		using(dateConv).map(source.getEndDate()).setEndDate(null);

		map().getParentTask().setParentTask(source.getParentTask());
	}

}
