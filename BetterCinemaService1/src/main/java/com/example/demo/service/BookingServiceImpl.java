package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Booking;
import com.example.demo.repository.BookingRepository;

public class BookingServiceImpl {
	
	@Autowired
	private BookingRepository bookingRepo;

	public List<Booking> getBooking(String userName) {

		return bookingRepo.findByUserName(userName);
	}


}
