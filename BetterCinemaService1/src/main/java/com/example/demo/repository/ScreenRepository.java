package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Screen;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Integer>{
	

	@Query(value = "select * from screen,theater where screen.thscid_fk = theater.theater_id and theater.theater_id=:theaterId",nativeQuery = true)
	List<Screen> getScreensFromTheater(@Param("theaterId") Integer theaterId);

	
	
	
}
