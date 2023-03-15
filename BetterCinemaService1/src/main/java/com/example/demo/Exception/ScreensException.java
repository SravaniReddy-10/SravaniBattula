package com.example.demo.Exception;

public class ScreensException extends RuntimeException {
    private String message;
    public ScreensException() {
    }
    public ScreensException(String message) {
        super(message);
        this.message = message;
    }

}
