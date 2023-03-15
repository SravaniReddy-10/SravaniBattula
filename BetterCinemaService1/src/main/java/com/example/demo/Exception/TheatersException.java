package com.example.demo.Exception;

public class TheatersException extends RuntimeException {
    private String message;
    public TheatersException() {
    }
    public TheatersException(String message) {
        super(message);
        this.message = message;
    }

}

