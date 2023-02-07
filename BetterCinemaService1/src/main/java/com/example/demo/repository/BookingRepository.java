package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Booking;

public interface BookingRepository  extends JpaRepository<Booking, Integer> {

	@Query(value = "select * from booking where user_id =(select id from user_table where user_name = ?1", nativeQuery = true)
	List<Booking> findByUserName(String userName);

}


