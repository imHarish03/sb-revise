package io.lab.imHarish03.model;

public class ErrorResponse {

	private String message;
	private int status;
	private long timestamp;

	public ErrorResponse() {
	}

	public ErrorResponse(String message) {
		this.message = message;
	}

	public ErrorResponse(String message, int status) {
		this.message = message;
		this.status = status;
		this.timestamp = System.currentTimeMillis();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public long getTimestamp() {
		return timestamp;
	}

}