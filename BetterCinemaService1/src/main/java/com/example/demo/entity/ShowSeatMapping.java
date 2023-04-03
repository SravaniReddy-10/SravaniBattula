package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "showseatmapping")
public class ShowSeatMapping {
	
	@Id
	private int showSeatId;
	private String status;
	private double price;
	
	
	
}
