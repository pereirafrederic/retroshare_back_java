package com.pereirafrederic.retroshare.model.validation.date;

import org.joda.time.LocalDate;

public class FutureLocalDateValidator extends
		AbstractJodaFutureValidator<LocalDate> {

	@Override
	protected boolean isNotAfterNow(LocalDate value) {
		return value.isBefore(new LocalDate());
	}

}
