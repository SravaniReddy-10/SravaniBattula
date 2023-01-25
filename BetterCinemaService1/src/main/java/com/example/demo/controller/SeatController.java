package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Seats;
import com.example.demo.service.SeatServiceImpl;

@CrossOrigin(origins="*")
@RestController

public class SeatController {
    
	@Autowired
	private SeatServiceImpl seatService;
	
	
	@GetMapping("/getSeats/{showid}")
	public List<Seats> getSeats(@PathVariable("showid") Integer showid){
		List<Seats> seats = seatService.getSeats(showid);
		return seats.stream().collect(Collectors.toSet()).stream().toList();
		
	}
}
