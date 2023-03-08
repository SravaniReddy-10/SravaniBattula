package com.example.demo.Exception;

public class MovieNotFoundException extends RuntimeException {
    private String message;
    public MovieNotFoundException() {
    }
    public MovieNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}


