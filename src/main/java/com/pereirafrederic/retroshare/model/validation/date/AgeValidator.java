package com.pereirafrederic.retroshare.model.validation.date;

import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgeValidator implements ConstraintValidator<Age, Object> {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(AgeValidator.class);

	private Age annotation;

	@Override
	public void initialize(Age constraintAnnotation) {
		this.annotation = constraintAnnotation;
	}

	@Override
	//@SuppressWarnings({ "squid:MethodCyclomaticComplexity" })
	public boolean isValid(Object value,
			ConstraintValidatorContext constraintContext) {

		LocalDate localDate = getLocalDateFromValue(value);
		LocalDate now = new LocalDate();

		boolean isMinInvalid = false;
		boolean isMaxInvalid = false;

		if (localDate != null) {
			int age = Years.yearsBetween(localDate, now).getYears();
			isMinInvalid = now.isAfter(localDate) && annotation.min() > 0
					&& age < annotation.min();
			isMaxInvalid = now.isAfter(localDate) && annotation.max() > 0
					&& age > annotation.max();
		}

		if (isMinInvalid || isMaxInvalid) {
			String message;
			if (isMinInvalid && isMaxInvalid) {
				message = annotation.message();
			} else if (isMinInvalid) {
				message = annotation.messageMin();
			} else {
				message = annotation.messageMax();
			}
			constraintContext.disableDefaultConstraintViolation();
			constraintContext.buildConstraintViolationWithTemplate(message)
					.addConstraintViolation();
			return false;
		}

		return true;

	}

	private LocalDate getLocalDateFromValue(Object value) {
		LocalDate localDate = null;
		if (value instanceof LocalDate) {
			localDate = (LocalDate) value;
		} else if (value instanceof DateTime) {
			localDate = ((DateTime) value).toLocalDate();
		} else if (value instanceof Date) {
			localDate = new LocalDate((Date) value);
		} else {
			LOGGER.warn("@Age annotation places on an invalid type.");
		}
		return localDate;
	}

}
