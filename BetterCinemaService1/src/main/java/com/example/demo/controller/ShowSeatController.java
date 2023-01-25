package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ShowSeatMapping;
import com.example.demo.service.ShowSeatMappingServiceImpl;
import com.example.demo.service.ShowServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class ShowSeatController {
	
	@Autowired
	private ShowSeatMappingServiceImpl showSeatService;
	
	@Autowired
	private ShowServiceImpl showService;
	
	
		
	}


