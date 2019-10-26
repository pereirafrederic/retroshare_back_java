package com.pereirafrederic.retroshare.model.validation.date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public abstract class AbstractJodaFutureValidator<T> implements
		ConstraintValidator<Future, T> {

	private Future annotation;

	@Override
	public void initialize(Future constraintAnnotation) {
		this.annotation = constraintAnnotation;

	}

	@Override
	public boolean isValid(T value, ConstraintValidatorContext context) {

		if (value != null && isNotAfterNow(value)) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(annotation.message())
					.addConstraintViolation();
			return false;
		}

		return true;
	}

	protected abstract boolean isNotAfterNow(T value);

}
