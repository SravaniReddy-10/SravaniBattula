package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.example.demo.Exception.TheaterNotFoundException;
import com.example.demo.entity.Movie;
import com.example.demo.entity.Theater;
import com.example.demo.repository.TheaterRepository;

@Service
public class TheaterServiceImpl {

	@Autowired
	private TheaterRepository theaterRepo;
	

	public List<Theater> getAllTheaters() {
		return theaterRepo.findAll();
	}

	
	
	
	public Theater addTheaters(Theater theater) {
		return theaterRepo.save(theater);
		
	}
	
	public Theater getTheatreById(Integer id) {
		return theaterRepo.findById(id).orElseThrow(
				() -> new TheaterNotFoundException("No Theater found with id =" +id) );	
	}
	
	 public List<Theater> getTheatreFromMovieid(Integer movieid){
		 List<Theater> theater = theaterRepo.getTheaterFromMovies(movieid);
		 return theater;
	 }

}
