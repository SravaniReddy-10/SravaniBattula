package com.example.demo.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Booking;
import com.example.demo.service.BookingServiceImpl;

public class BookingController {
	
	@Autowired
	private BookingServiceImpl bookingService;

	@GetMapping("/user/{userName}/booking")
	public ResponseEntity<List<Booking>> getUserBookings(@PathVariable("username") String userName) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getForEntity("http://localhost:8082/api/user/{userName}", User.class);
		List<Booking> results = bookingService.getBooking(userName);
		return new ResponseEntity<>(results, HttpStatus.OK);
	}

}
