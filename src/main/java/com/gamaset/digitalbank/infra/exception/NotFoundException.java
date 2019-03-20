package com.gamaset.digitalbank.infra.exception;

public class NotFoundException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public NotFoundException(final String message) {
		super(message);
	}

	public NotFoundException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public NotFoundException(final Throwable cause) {
		super(cause);
	}

}
