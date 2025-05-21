package io.lab.imHarish03.exception;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MultiErrorResponse {
    private String message;
    private int status;
    private Map<String, List<String>> errors; // Changed to Map for field-specific errors
    
    public MultiErrorResponse(String message, int status, Map<String, List<String>> errors) {
        this.message = message;
        this.status = status;
        this.errors = errors;
    }
    
    // Getters and setters


}