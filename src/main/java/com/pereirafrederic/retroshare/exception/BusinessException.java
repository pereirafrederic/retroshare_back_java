package com.pereirafrederic.retroshare.exception;

import java.io.Serializable;

import org.slf4j.Marker;
import org.slf4j.event.Level;

public class BusinessException extends RetroException {

	/**
     * 
     */
	private static final long serialVersionUID = -7949273305125352504L;
	private final Serializable[] messageArgs;
	private final boolean includeStackTrace;
	private final Level logLevel;

	public BusinessException(String logmessage, Throwable cause,
			Serializable... messageArgs) {
		this(logmessage, Level.ERROR, true, null, cause, messageArgs);
	}

	public BusinessException(String logmessage, Marker logMarker,
			Throwable cause, Serializable... messageArgs) {
		this(logmessage, Level.ERROR, true, logMarker, cause, messageArgs);
	}

	public BusinessException(String logmessage, Level logLevel,
			boolean includeStackTrace, Marker logMarker, Throwable cause,
			Serializable... messageArgs) {
		super(logmessage, logMarker, cause);
		this.messageArgs = messageArgs;
		this.includeStackTrace = includeStackTrace;
		this.logLevel = logLevel;
	}

	public Object[] getMessageArgs() {
		return messageArgs;
	}

	public boolean isIncludeStackTrace() {
		return includeStackTrace;
	}

	public Level getLogLevel() {
		return logLevel;
	}

}
