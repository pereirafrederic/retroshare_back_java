package com.pereirafrederic.retroshare.model.validation;

import java.lang.annotation.Annotation;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

public abstract class AbstractRegexValidator<T extends Annotation> implements
		ConstraintValidator<T, CharSequence> {

	private Pattern regEx;

	private String message;

	@Override
	public void initialize(T constraintAnnotation) {
		this.regEx = Pattern.compile(getAnnotationRegex(constraintAnnotation));
		this.message = getAnnotationMessage(constraintAnnotation);
	}

	protected abstract String getAnnotationRegex(T constraintAnnotation);

	protected abstract String getAnnotationMessage(T constraintAnnotation);

	@Override
	public boolean isValid(CharSequence value,
			ConstraintValidatorContext context) {
		if (StringUtils.isNotBlank(value) && !regEx.matcher(value).matches()) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(message)
					.addConstraintViolation();
			return false;
		}
		return true;
	}
}
