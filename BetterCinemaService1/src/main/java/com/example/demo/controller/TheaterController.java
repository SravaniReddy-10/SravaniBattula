package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Theater;
import com.example.demo.service.TheaterServiceImpl;

@CrossOrigin(origins="*")
@RestController

public class TheaterController {
	
	@Autowired
	private TheaterServiceImpl theatreService;
	
	@PostMapping("/addTheater")
	public Theater addTheatre(@RequestBody Theater theater) {
		Theater addTheater = theatreService.addTheaters(theater);
		return addTheater;
	}
	
	@GetMapping("/")
	public List<Theater> getAllTheatres(){
		return theatreService.getAllTheaters();
	}

	@GetMapping("/theatre/{id}")
	public Theater getTheatreById(@PathVariable Integer id) {
		return theatreService.getTheatreById(id);
	}
	
	@GetMapping("/getTheatreFromMovieId/{movieid}")
	 public List<Theater> getMoviesFromTheater(@PathVariable("movieid") int movieid){
		 List<Theater> theater = theatreService.getTheatreFromMovieid(movieid);
		 
		 return theater.stream().collect(Collectors.toSet()).stream().toList();
	 }
}
