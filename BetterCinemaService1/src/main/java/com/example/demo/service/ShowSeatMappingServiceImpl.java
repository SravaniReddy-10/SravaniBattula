package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Payment;
import com.example.demo.entity.Seats;
import com.example.demo.entity.Show;
import com.example.demo.entity.ShowSeatMapping;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.repository.SeatRepository;
import com.example.demo.repository.ShowRepository;
import com.example.demo.repository.ShowSeatMappingRepository;

@Service
public class ShowSeatMappingServiceImpl {

	@Autowired
	private ShowSeatMappingRepository showSeatRepo;
	
	@Autowired
	private SeatRepository seatRepo;
	
	@Autowired
	private ShowRepository showRepo;
	
	@Autowired
	private BookingRepository bookingRepo;
	
	@Autowired
	private PaymentRepository paymentRepo;
	
	
	public  String checkIfSeaEmpty(Integer seatId) {
		ShowSeatMapping showSeatMapping = showSeatRepo.findBySeatId(seatId);
		if(showSeatMapping.getStatus().equals( "available")) {
			return "available";
		}
		return "notavailable";
	}
	
	
}

