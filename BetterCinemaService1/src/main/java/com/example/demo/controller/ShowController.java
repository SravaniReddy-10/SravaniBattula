package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;
import com.example.demo.entity.Show;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.ShowServiceImpl;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/show")
public class ShowController {

	@Autowired
	private ShowServiceImpl showService;
	
	@Autowired
	private MovieRepository movieRepo;
	
	
		
		
		@GetMapping("/getMovieByTime/{time}")
		public List<Movie> getMoviesTime(@PathVariable("time") String time){
			List<Integer> movies= showService.getMovieTime(time);
			Set<Integer> movie = new HashSet<>(movies);
			List<Movie> movieTime = new ArrayList<>();
			for (Integer m:movie) {
				movieTime.add(movieRepo.findById(m).get());
				
				
			}
		
            return movieTime;
		
		}	
		
		
		@GetMapping("/getShowByMovies/{movieId}")
		public List<Show> getShowsMovie(@PathVariable("movieId") String movieId){
			List<Show> shows = showService.getShowsByMovie(movieId);
			return shows;
		}
		
		
		
	
}

