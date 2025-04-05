package io.lab.imHarish03.exception;

public class InvalidInputException extends RuntimeException {
	private String message;

	public InvalidInputException(String messsage) {
		super(messsage);
		this.message = messsage;
	}

	public String getMessage() {
		return message;
	}

}
