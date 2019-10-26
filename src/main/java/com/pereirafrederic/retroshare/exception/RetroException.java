package com.pereirafrederic.retroshare.exception;

import org.slf4j.Marker;

public class RetroException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private final Marker marker;

	public RetroException(String logMessage, Marker marker, Throwable cause) {
		super(logMessage, cause);
		this.marker = marker;
	}

	public RetroException(String logMessage) {
		super(logMessage);
		this.marker = null;
	}

	public RetroException(Throwable cause) {
		super(cause);
		this.marker = null;
	}

	public Marker getMarker() {
		return marker;
	}

}
