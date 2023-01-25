package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	public Movie findByTitle(String title);
	
	@Query(value = "SELECT movie.id,movie.title,movie.description,movie.image,movie.language FROM movie,show,screen,theatre where movie.id = show.movie_id and show.screenid_fk = screen.screen_id and screen.thscid_fk = theatre.theatre_id and theatre.theatre_id =:theatreId",nativeQuery = true)
	List<Movie> getMoviesFromTheatre(@Param("theatreId") Integer theatreId);
	
	@Query(value = " SELECT * FROM movie,show where movie.id = show.movie_id and show.time=:time", nativeQuery=true)
	List<Movie> findMovieByTime(String time);
	
	

}
