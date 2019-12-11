package com.iiht.capsule;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.iiht.capsule.model.map.AddTaskRequestToTaskMap;
import com.iiht.capsule.model.map.TaskToTaskDTOMap;
import com.iiht.capsule.model.map.UpdateTaskRequestToTaskMap;

/**
 * Task Manager Application
 * 
 * @author Giri
 * @version 1.0
 */
@SpringBootApplication
public class FsdCapsuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsdCapsuleApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		modelMapper.addMappings(new AddTaskRequestToTaskMap());
		modelMapper.addMappings(new UpdateTaskRequestToTaskMap());
		modelMapper.addMappings(new TaskToTaskDTOMap());

		return modelMapper;
	}
}
