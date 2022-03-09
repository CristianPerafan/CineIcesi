package model;

import java.time.LocalDate;
import java.time.LocalTime;

import enumerations.CinemaType;

public class CineFunction {
	
	///Attributes///
	private String name;
	
	private LocalDate date;
	
	private LocalTime startTime;
	
	private LocalTime endTime;
	
	@SuppressWarnings("unused")
	private int movieDurationHours;
	@SuppressWarnings("unused")
	private int movieDurationMinutes;
	
	
	///Relations///
	private CinemaType cinemaType;
	
	public CineFunction(String name, LocalDate date, LocalTime starTime,
			int movieDurationHours, int movieDurationMinutes ,LocalTime endTime, int identifierType) {
		
		this.name = name;
		this.date = date;
		this.startTime = starTime;
		
		this.movieDurationHours = movieDurationHours;
		this.movieDurationMinutes = movieDurationMinutes;
		
		this.endTime = endTime;
		
		
		if(identifierType == 0) {
			setCinemaType(CinemaType.MINICIMENA);
		}
		else {
			setCinemaType(CinemaType.MEDIUMCINEMA);
		}
		
		
	}
	
	//Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}


	public CinemaType getCinemaType() {
		return cinemaType;
	}

	public void setCinemaType(CinemaType cinemaType) {
		this.cinemaType = cinemaType;
	}

}
