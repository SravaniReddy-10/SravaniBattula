package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Show;
import com.example.demo.repository.ShowRepository;

@Service
public class ShowServiceImpl {
	
	@Autowired
	private ShowRepository showRepo;
	
	 public List<Show>  getShowsFromMovieid(Integer movieid){
		 List<Show> shows = showRepo.getShowsFromMovieid(movieid) ;
		 return shows;
	 }
	
	 public List<Show>  getShowsFromMovieidAndTheaterId(Integer movieid,Integer theaterId){
		 List<Show> shows = showRepo.getShowsFromMovieAndTheater(movieid, theaterId);
		 return shows;
	 }
	 

	public List<Integer> getMovieTime(String time){
		return showRepo.getMovieByTime(time);
	}
	 
	
	 
	
}

