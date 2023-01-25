package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer>{
    
	@Query(value = " SELECT *FROM movie join show ON movie.id = show.movie_id where show.movie_id =:movieid" , nativeQuery = true)
	List<Show> getShowsFromMovieid(@Param("movieid")   Integer movieid);
	
	@Query(value = "  select *from show,screen,theater,movie where show.screenid_fk =screen.screen_id and screen.thscid_fk = theatre.theatre_id and show.movie_id= movie.id and theater.theater_id=:theaterId and movie.id=:movieid" , nativeQuery = true)
    List<Show> getShowsFromMovieAndTheater(@Param("movieid")   Integer movieid, @Param("theaterId") Integer theatreId);
	
	@Query(value = "select movie_id from show s where s.time=:time", nativeQuery = true)
	List<Integer> getMovieByTime(@Param("time") String time);
	
	
	
}
