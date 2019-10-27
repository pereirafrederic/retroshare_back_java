package com.pereirafrederic.retroshare.model.converter;

import java.sql.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.joda.time.DateTime;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<DateTime, Date> {

	@Override
	public Date convertToDatabaseColumn(DateTime localDate) {
		return new java.sql.Date(localDate.toDate().getTime());
	}

	@Override
	public DateTime convertToEntityAttribute(Date date) {
		return new DateTime(date);
	}
}