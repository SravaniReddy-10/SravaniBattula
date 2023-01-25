package com.example.demo.Exception;

public class NoSuchElementException extends RuntimeException {
    private String message;
    public NoSuchElementException() {
    }
    public NoSuchElementException(String message) {
        super(message);
        this.message = message;
    }

}