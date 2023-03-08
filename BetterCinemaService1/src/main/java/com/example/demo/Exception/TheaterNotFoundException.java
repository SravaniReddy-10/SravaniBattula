package com.example.demo.Exception;

public class TheaterNotFoundException extends RuntimeException {
    private String message;
    public TheaterNotFoundException() {
    }
    public TheaterNotFoundException(String message) {
        super(message);
        this.message = message;
    }

}

