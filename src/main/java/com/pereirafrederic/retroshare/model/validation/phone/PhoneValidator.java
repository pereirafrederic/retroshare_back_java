package com.pereirafrederic.retroshare.model.validation.phone;

import com.pereirafrederic.retroshare.model.validation.AbstractRegexValidator;

public class PhoneValidator extends AbstractRegexValidator<Phone> {

	@Override
	protected String getAnnotationRegex(Phone constraintAnnotation) {
		return constraintAnnotation.pattern();
	}

	@Override
	protected String getAnnotationMessage(Phone constraintAnnotation) {
		return constraintAnnotation.message();
	}

}
