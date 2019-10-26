package com.pereirafrederic.retroshare.model.validation.date;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD, PARAMETER })
@Retention(RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
@Documented
public @interface Age {

	String message() default "{validation.age}";

	String messageMin() default "{validation.age.min}";

	String messageMax() default "{validation.age.max}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	/**
	 * @return The fields field
	 */
	int min() default -1;

	int max() default -1;

	/**
	 * Defines several <code>@FieldMatch</code> annotations on the same element
	 *
	 * @see FieldMatch
	 */
	@Target({ TYPE, ANNOTATION_TYPE })
	@Retention(RUNTIME)
	@Documented
	@interface List {
		Age[] value();
	}
}
