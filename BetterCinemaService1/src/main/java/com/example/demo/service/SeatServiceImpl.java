package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Seats;
import com.example.demo.repository.SeatRepository;

@Service
public class SeatServiceImpl {
      
	@Autowired
	private SeatRepository seatRepo;
	
	public List<Seats> getSeats(Integer showid){
		List<Seats> seats = seatRepo.getSeats(showid);
		return seats;
		
		
	}
}

