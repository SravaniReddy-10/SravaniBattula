package com.example.demo.Exception;

public class BussinessException extends RuntimeException {
    private String message;
    public BussinessException() {
    }
    public BussinessException(String message) {
        super(message);
        this.message = message;
    }
}

