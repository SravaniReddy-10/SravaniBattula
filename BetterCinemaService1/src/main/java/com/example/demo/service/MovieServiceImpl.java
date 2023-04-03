package com.example.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.demo.Exception.MoviesException;

import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;

@Service
public class MovieServiceImpl {
	
	@Autowired
	private MovieRepository movieRepo;
	

	public Movie getMoviesByTitle(String title){
	    Movie m = movieRepo.findByTitle(title);
	    if(m == null) {
	    throw new MoviesException("no movie with title =" +title +"found");
	    
	    }
	    return m;
	    }
	    
	
    public Movie getMovieById(Integer id) {
		return movieRepo.findById(id).orElseThrow(
				() -> new MoviesException("No Movie found with id =" +id) );	 
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
	 
	 public Set<Movie> getMoviesByTime(String time){
			List<Movie> movies = movieRepo.findMovieByTime(time);
			Set <Movie> movie = new HashSet <Movie>();
			for (Movie i:movies) {
				movie.add(i);
				
				
			}
			
			if(movies.isEmpty()) {
		    	throw new MoviesException("no movie Found at this time = "+time);
		    }
			return movie;
			
			
		}
	 
	 	

}

