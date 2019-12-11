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
public class StringLocalDateConverter implements Converter<LocalDate, String> {

	@Override
	public String convert(MappingContext<LocalDate, String> context) {

		LocalDate localDate = context.getSource();

		if (Objects.nonNull(localDate)) {
			DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/d/yyyy");
			return localDate.format(df);
		}

		return null;
	}

}
