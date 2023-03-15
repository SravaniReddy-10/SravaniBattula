package com.example.demo.Exception;

public class ShowsException extends RuntimeException {
    private String message;
    public ShowsException() {
    }
    public ShowsException(String message) {
        super(message);
        this.message = message;
    }
}
