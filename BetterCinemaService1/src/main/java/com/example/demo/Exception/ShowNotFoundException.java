package com.example.demo.Exception;

public class ShowNotFoundException extends RuntimeException {
    private String message;
    public ShowNotFoundException() {
    }
    public ShowNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
