package com.pereirafrederic.retroshare.model.validation.date;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * The Interface DateFormat.
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { DateFormatValidator.class })
public @interface DateFormat {

	/**
	 * Message.
	 *
	 * @return the string
	 */
	String message() default "{validation.date.badformat}";

	/**
	 * Groups.
	 *
	 * @return the class[]
	 */
	Class<?>[] groups() default {};

	/**
	 * Payload.
	 *
	 * @return the class<? extends payload>[]
	 */
	Class<? extends Payload>[] payload() default {};

	/**
	 * Pattern.
	 *
	 * @return the string
	 */
	public String pattern();

	public boolean withTime() default false;

}
