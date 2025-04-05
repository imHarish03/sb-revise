package io.lab.imHarish03.exception;

public class EmployeeNotFoundException extends RuntimeException {

	private final int statusCode;
	private final String message;

	public EmployeeNotFoundException(String message, int statusCode) {
		super(message);
		this.statusCode = statusCode;
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getMessage() {
		return message;
	}
}
