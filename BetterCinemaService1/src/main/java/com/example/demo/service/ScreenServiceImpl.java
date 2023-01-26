package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Screen;
import com.example.demo.repository.ScreenRepository;

@Service
public class ScreenServiceImpl {
	
	@Autowired
	private ScreenRepository screenRepo;
	
	 public List<Screen> getScreenFromTheater(Integer theaterId){
		 List<Screen> screen = screenRepo.getScreensFromTheater(theaterId);
		 return screen;
	 }

	
}
