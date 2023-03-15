package com.example.demo.Exception;

public class SeatsException extends RuntimeException {
    private String message;
    public SeatsException() {
    }
    public SeatsException(String message) {
        super(message);
        this.message = message;
    }

}
