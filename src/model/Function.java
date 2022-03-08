package model;

import java.time.LocalDate;

public class Function {
	
	///Attributes///
	private String name;
	
	private LocalDate date;
	
	private int movieDurationHours;
	
	private int movieDurationMinutes;
	
	///Relations///
	

	public Function(String name, LocalDate date, int movieDurationHours, int movieDurationMinutes) {
		
		this.name = name;
		this.date = date;
		this.movieDurationHours = movieDurationHours;
		this.movieDurationMinutes = movieDurationMinutes;
		
	}

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

}
