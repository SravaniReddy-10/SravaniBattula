package com.example.demo.controller;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieServiceImpl;
@CrossOrigin(origins="*")
@RestController

public class MovieController {

	@Autowired
	private MovieServiceImpl movieService;
	
	//searchByTitle
	@GetMapping("/movie/{title}")
    public Movie getMovieByTitle(@RequestParam("title") String title) {
        return movieService.getMoviesByTitle(title);
    }
	
	
	//byId
	@GetMapping("/movies/{id}")
	public Movie getMovieById(@PathVariable Integer id) {
		return movieService.getMovieById(id);
	}
	
	//allMovies
	@GetMapping("/getAllMovies")
	List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	 @PostMapping("/add")
	    public Movie addMovie(@RequestBody Movie movie) {
	        Movie saveMovie = movieService.saveMovie(movie);
	        return saveMovie;
	 }
	 
	
	
	@GetMapping("/SearchByTime/{time}")
	public List<Movie> SearchByTime(@PathVariable("time") String time){
		List<Movie> movies = movieService.getMoviesByTime(time);
		return movies;
		
	}
	 
	 @GetMapping("/searchMovie/{movieName}")
	 public Movie searchMovie (@PathVariable String movieName ) {
		 Movie movie = movieService.getMoviesByTitle(movieName);
		 return movie;
	 }
}
