package com.example.demo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.Exception.BussinessException;
import com.example.demo.Exception.NoSuchElementException;

@ControllerAdvice
public class ExceptionHandling {
	
	@ExceptionHandler(value = BussinessException.class)
	public ResponseEntity<String> handleBussinessException(BussinessException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler(value = NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElement(NoSuchElementException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
