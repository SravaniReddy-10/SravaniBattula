package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Movie;
import com.example.demo.entity.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Integer>{
	
	
	@Query(value = "SELECT theater.* FROM movie,show,screen,theater where movie.id = show.movie_id and show.screenid_fk = screen.screen_id and screen.thscid_fk = theater.theater_id and movie.id=:movieid",nativeQuery = true)
	List<Theater> getTheaterFromMovies(@Param("movieid") Integer movieid);

}
