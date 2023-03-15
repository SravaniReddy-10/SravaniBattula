package com.example.demo.Exception;

public class MoviesException extends RuntimeException {
    private String message;
    public MoviesException() {
    }
    public MoviesException(String message) {
        super(message);
        this.message = message;
    }
}


