package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ShowNotFoundException;
import com.example.demo.entity.Movie;
import com.example.demo.entity.Show;
import com.example.demo.repository.ShowRepository;

@Service
public class ShowServiceImpl {
	
	@Autowired
	private ShowRepository showRepo;
	
	

	public List<Integer> getMovieTime(String time){
		return showRepo.getMovieByTime(time);
		
	}

	
	
	public List<Show> getShowsByMovie(String movieid){
		List<Show> shows = showRepo.getShows(movieid);
		if(shows.isEmpty()) {
	    	throw new ShowNotFoundException("no shows with this movieId =" + movieid  +"found");
	    }
	    
		return shows;
	}
	}
	 
	
	 
	


