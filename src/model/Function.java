package model;

import java.time.LocalDate;

import enumerations.CinemaType;

public class Function {
	
	///Attributes///
	private String name;
	
	private LocalDate date;
	
	private int movieDurationHours;
	
	private int movieDurationMinutes;
	
	///Relations///
	private CinemaType cinemaType;
	
	public Function(String name, LocalDate date, int movieDurationHours, int movieDurationMinutes,
			int identifierType) {
		
		this.name = name;
		this.date = date;
		this.movieDurationHours = movieDurationHours;
		this.movieDurationMinutes = movieDurationMinutes;
		
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

	public int getMovieDurationHours() {
		return movieDurationHours;
	}

	public void setMovieDurationHours(int movieDurationHours) {
		this.movieDurationHours = movieDurationHours;
	}

	public int getMovieDurationMinutes() {
		return movieDurationMinutes;
	}

	public void setMovieDurationMinutes(int movieDurationMinutes) {
		this.movieDurationMinutes = movieDurationMinutes;
	}

	public CinemaType getCinemaType() {
		return cinemaType;
	}

	public void setCinemaType(CinemaType cinemaType) {
		this.cinemaType = cinemaType;
	}

}
