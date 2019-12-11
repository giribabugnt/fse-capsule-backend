package com.iiht.capsule.model.map.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

/**
 * 
 * @author Giri
 * @version 1.0
 */
public class LocalDateConverter implements Converter<String, LocalDate> {

	@Override
	public LocalDate convert(MappingContext<String, LocalDate> context) {

		String srcDate = context.getSource();
		if (Objects.nonNull(srcDate)) {
			DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/d/yyyy");
			return LocalDate.parse(srcDate, df);
		}

		return null;
	}

}
