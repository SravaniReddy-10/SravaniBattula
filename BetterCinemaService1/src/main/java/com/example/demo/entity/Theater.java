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


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "theater")
public class Theater {
	
	@Id
	private int theaterId;
	private String theaterName;
	private String city;
	
	@OneToMany(targetEntity = Screen.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "thscid_fk", referencedColumnName = "theaterId")
	private List<Screen> screens;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}


}
