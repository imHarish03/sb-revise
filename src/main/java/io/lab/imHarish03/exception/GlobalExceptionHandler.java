package io.lab.imHarish03.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import io.lab.imHarish03.model.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public @ResponseBody ErrorResponse handleException(EmployeeNotFoundException ex) {
		ErrorResponse response = new ErrorResponse(ex.getMessage());
		HttpStatus status = HttpStatus.resolve(ex.getStatusCode());

		// Fallback to INTERNAL_SERVER_ERROR if status code is not valid
		if (status == null) {
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return response;
	}

	@ExceptionHandler(InvalidInputException.class)
	public @ResponseBody ErrorResponse handleInvalidInputException(InvalidInputException ex) {
		ErrorResponse response = new ErrorResponse(ex.getMessage());
		return response;
	}

	@ExceptionHandler(EmployeeAlreadyExistsException.class)
	public @ResponseBody ErrorResponse handleEmployeeAlreadyExistsExceptionException(
			EmployeeAlreadyExistsException ex) {
		ErrorResponse response = new ErrorResponse(ex.getMessage());
		return response;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleValidationErrors(MethodArgumentNotValidException ex) {
	    String errorMessage = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();
	    return new ResponseEntity<>(new ErrorResponse(errorMessage, 400), HttpStatus.BAD_REQUEST);
	}
}
