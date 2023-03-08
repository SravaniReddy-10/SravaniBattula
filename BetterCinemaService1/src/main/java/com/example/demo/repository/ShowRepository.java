package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer>{
    
	
	
	@Query(value = "select movie_id from show s where s.time=:time", nativeQuery = true)
	List<Integer> getMovieByTime(@Param("time") String time);
	
	@Query(value = "select * from show s where s.movie_id =:movieId" , nativeQuery = true)
    List<Show> getShows(@Param("movieId") String movieId);
	
	
}
