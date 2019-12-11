package com.iiht.capsule.model.map;

import java.time.LocalDate;

import org.modelmapper.Converter;
import org.modelmapper.PropertyMap;

import com.iiht.capsule.model.dao.Task;
import com.iiht.capsule.model.dto.TaskDTO;
import com.iiht.capsule.model.map.converter.StringLocalDateConverter;

/**
 * AddTaskRequest to Task mapping class
 * 
 * @author Giri
 * @version 1.0
 */
public class TaskToTaskDTOMap extends PropertyMap<Task, TaskDTO> {

	@Override
	protected void configure() {

		map().setTaskId(source.getTaskId());
		map().setTask(source.getTask());
		map().setPriority(source.getPriority());
		map().setTaskOpen(source.getTaskOpen());

		Converter<LocalDate, String> dateStrConv = new StringLocalDateConverter();
		using(dateStrConv).map(source.getStartDate()).setStartDate(null);
		using(dateStrConv).map(source.getEndDate()).setEndDate(null);

		map().setParentId(source.getParentTask().getParentId());
		map().setParentTask(source.getParentTask().getParentTask());
	}

}
