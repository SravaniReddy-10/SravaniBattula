package com.example.demo.advice;

import org.springframework.http.HttpStatus;





import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.Exception.MoviesException;
import com.example.demo.Exception.ScreensException;
import com.example.demo.Exception.SeatsException;
import com.example.demo.Exception.ShowsException;
import com.example.demo.Exception.TheatersException;



@ControllerAdvice
public class ExceptionHandling {
	
	@ExceptionHandler(value = MoviesException.class)
	public ResponseEntity<String> handleMovieNameNotFoundException(MoviesException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	

	@ExceptionHandler(value = TheatersException.class)
	public ResponseEntity<String> handleTheaterNotFoundException(TheatersException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(value = ShowsException.class)
	public ResponseEntity<String> handleShowNotFoundException(ShowsException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = ScreensException.class)
	public ResponseEntity<String> handleScreenNotFoundException(ScreensException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = SeatsException.class)
	public ResponseEntity<String> handleSeatsNotFoundException(SeatsException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
