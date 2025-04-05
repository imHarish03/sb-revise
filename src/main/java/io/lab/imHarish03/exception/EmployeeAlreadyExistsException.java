package io.lab.imHarish03.exception;

public class EmployeeAlreadyExistsException extends RuntimeException {

	private String message;

	public EmployeeAlreadyExistsException(String string) {
		super(string);
		this.message = string;
	}

	public String getMessage() {
		return message;
	}

}
