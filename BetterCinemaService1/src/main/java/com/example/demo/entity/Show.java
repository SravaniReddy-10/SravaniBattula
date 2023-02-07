package com.example.demo.entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "show")
public class Show {
	
	@Id
	private int showId;
	private String day;
	private String time;
	
	@OneToMany(targetEntity = ShowSeatMapping.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "showid_fk", referencedColumnName = "showId")
	private List<ShowSeatMapping> showSeatMappings;
	
	@OneToMany(targetEntity = Booking.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "shbkid_fk", referencedColumnName = "showId")
	private List<Booking> bookings;

	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
	


}
