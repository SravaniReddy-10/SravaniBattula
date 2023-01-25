package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Screen;
import com.example.demo.service.ScreenServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class ScreenController {

	@Autowired
	private ScreenServiceImpl screenService;
	
	@GetMapping("/getScreensFromTheater/{theaterId}")
	 public List<Screen> getScreenFromTheater(@PathVariable("theaterId") int theaterId){
		 List<Screen> screen = screenService.getScreenFromTheater(theaterId);
		 
		 return screen.stream().collect(Collectors.toSet()).stream().toList();
	 }
	
	@GetMapping("/getScreenFromShowIdAndTime/{showid}/{time}")
	 public Screen getScreenFromShowIdAndTime(@PathVariable("showid") int showid , @PathVariable("time") String time){
		  return screenService.getScreenFromShowIdAndTime(showid, time);
		 
	 }
}

