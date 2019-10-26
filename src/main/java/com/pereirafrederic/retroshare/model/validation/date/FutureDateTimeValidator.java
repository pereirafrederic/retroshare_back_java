package com.pereirafrederic.retroshare.model.validation.date;

import org.joda.time.DateTime;

public class FutureDateTimeValidator extends
		AbstractJodaFutureValidator<DateTime> {

	@Override
	protected boolean isNotAfterNow(DateTime value) {
		return !value.isAfterNow();
	}

}
