package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.demo.Exception.MovieNotFoundException;

import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;

@Service
public class MovieServiceImpl {
	
	@Autowired
	private MovieRepository movieRepo;
	

	public Movie getMoviesByTitle(String title){
	    Movie m = movieRepo.findByTitle(title);
	    if(m == null) {
	    throw new MovieNotFoundException("no movie with title =" +title +"found");
	    
	    }
	    return m;
	    }
	    
	
    public Movie getMovieById(Integer id) {
		return movieRepo.findById(id).orElseThrow(
				() -> new MovieNotFoundException("No Movie found with id =" +id) );	 
	}
	
   
	
	public List<Movie> getAllMovies() {
		List<Movie> movies = movieRepo.findAll();
		return movies;
	}
	
	 public Movie saveMovie(Movie movie) {
	        return movieRepo.save(movie);
	    }
	 
	 public List<Movie> getMoviesFromTheatre(Integer theatreId){
		 List<Movie> movies = movieRepo.getMoviesFromTheatre(theatreId);
		 return movies;
	 }
	 
	 public List<Movie> getMoviesByTime(String time){
			List<Movie> movies = movieRepo.findMovieByTime(time);
			if(movies.isEmpty()) {
		    	throw new MovieNotFoundException("no movie Found at this time = "+time);
		    }
			return movies;
			
		}
	 
	 	

}

