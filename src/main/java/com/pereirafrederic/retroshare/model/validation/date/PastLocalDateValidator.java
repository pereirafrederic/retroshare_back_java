package com.pereirafrederic.retroshare.model.validation.date;

import org.joda.time.LocalDate;

public class PastLocalDateValidator extends
		AbstractJodaPastValidator<LocalDate> {

	@Override
	protected boolean isNotBeforeNow(LocalDate value) {
		return value.isAfter(new LocalDate());
	}

}
