package com.example.demo.advice;

import org.springframework.http.HttpStatus;





import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.Exception.MovieNotFoundException;
import com.example.demo.Exception.ShowNotFoundException;
import com.example.demo.Exception.TheaterNotFoundException;



@ControllerAdvice
public class ExceptionHandling {
	
	@ExceptionHandler(value = MovieNotFoundException.class)
	public ResponseEntity<String> handleMovieNameNotFoundException(MovieNotFoundException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	

	@ExceptionHandler(value = TheaterNotFoundException.class)
	public ResponseEntity<String> handleTheaterNotFoundException(TheaterNotFoundException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(value = ShowNotFoundException.class)
	public ResponseEntity<String> handleShowNotFoundException(ShowNotFoundException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
	
}
