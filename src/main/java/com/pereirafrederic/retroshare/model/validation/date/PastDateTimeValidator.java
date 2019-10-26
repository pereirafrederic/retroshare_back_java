package com.pereirafrederic.retroshare.model.validation.date;

import org.joda.time.DateTime;

public class PastDateTimeValidator extends AbstractJodaPastValidator<DateTime> {

	@Override
	protected boolean isNotBeforeNow(DateTime value) {
		return !value.isBeforeNow();
	}

}
