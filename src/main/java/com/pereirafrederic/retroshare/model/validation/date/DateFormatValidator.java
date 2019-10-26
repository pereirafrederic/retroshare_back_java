package com.pereirafrederic.retroshare.model.validation.date;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.util.Assert;

public class DateFormatValidator implements
		ConstraintValidator<DateFormat, String> {

	private static final Map<String, DateTimeFormatter> FORMATTER_BY_PATTERN = new HashMap<>();

	private DateFormat annotation = null;

	@Override
	public void initialize(DateFormat constraintAnnotation) {
		annotation = constraintAnnotation;
		String pattern = constraintAnnotation.pattern();
		Assert.isTrue(StringUtils.isNotBlank(pattern),
				"Pattern in @DateFormat must not be null nor empty.");
		if (!FORMATTER_BY_PATTERN.containsKey(pattern)) {
			FORMATTER_BY_PATTERN.put(constraintAnnotation.pattern(),
					DateTimeFormat.forPattern(constraintAnnotation.pattern()));
		}

	}

	@Override
	@SuppressWarnings({ "squid:S1166" })
	// assumed because we do not want to
	// polluate logs
	public boolean isValid(String value,
			ConstraintValidatorContext constraintContext) {
		if (value == null) {
			return true;
		}
		try {
			if (annotation.withTime()) {
				FORMATTER_BY_PATTERN.get(annotation.pattern()).parseDateTime(
						value);
			} else {
				FORMATTER_BY_PATTERN.get(annotation.pattern()).parseLocalDate(
						value);
			}
		} catch (IllegalArgumentException e) {
			constraintContext.disableDefaultConstraintViolation();
			constraintContext.buildConstraintViolationWithTemplate(
					annotation.message()).addConstraintViolation();
			return false;
		}
		return true;
	}

}
