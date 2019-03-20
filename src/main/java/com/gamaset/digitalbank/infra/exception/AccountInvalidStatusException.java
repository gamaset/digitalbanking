package com.gamaset.digitalbank.infra.exception;

public class AccountInvalidStatusException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public AccountInvalidStatusException(final String message) {
		super(message);
	}

	public AccountInvalidStatusException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public AccountInvalidStatusException(final Throwable cause) {
		super(cause);
	}

}
