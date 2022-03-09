package controller;

import java.time.LocalDate;
import java.time.LocalTime;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.CineFunction;

public class RegisterAFunctionController {
	
	//Relations
	@SuppressWarnings("unused")
	private Main main;
	
	@FXML
	private TextField textFieldName;
	
	@FXML
	private TextField textFieldStartHour,textFieldStartMinutes;
	
	@FXML
	private TextField textFieldDurationHours,textFieldDurationMinutes;
	
	@FXML
	private DatePicker datepicker;
	
	@FXML
	private RadioButton miniCinemaRadioButton,mediumCinemaRadioButton;
	
	@FXML
	private Button saveButton;
	

	public RegisterAFunctionController() {
		// TODO Auto-generated constructor stub
	}
	
	public void saveAFunction(ActionEvent e) {
		getAndSaveAFunction();
	}
	
	public void getAndSaveAFunction() {
		
		String name = textFieldName.getText();
		
		LocalDate date = datepicker.getValue();
		
		
		String auxStartHour = textFieldStartHour.getText();
		String auxStartMinutes = textFieldStartMinutes.getText();
		
		String auxDurationHours = textFieldDurationHours.getText();
		String auxDurationMinutes = textFieldDurationMinutes.getText();
		
		int typeOfCinema = 3;
		
		if(miniCinemaRadioButton.isSelected() == true) {
			//MINI CINEMA
			typeOfCinema = 0;
		}
		else if(mediumCinemaRadioButton.isSelected() == true) {
			//MEDIUM CINEMA
			typeOfCinema = 1;
		}	
		
		try {
			int startHour = Integer.parseInt(auxStartHour);
			int startMinutes = Integer.parseInt(auxStartMinutes);
			
			int durationHours = Integer.parseInt(auxDurationHours);
			int durationMinutes = Integer.parseInt(auxDurationMinutes);
			
			//Start time
			LocalTime startTime = LocalTime.of(startHour, startMinutes);
			
			LocalTime auxEndTime = startTime;
			
			auxEndTime.plusHours(durationHours);
			auxEndTime.plusMinutes(durationMinutes);
			
			LocalTime endTime = auxEndTime;
			
			CineFunction objCineFunction = new CineFunction(name,date,startTime,durationHours,
					durationMinutes,endTime,typeOfCinema);
			
			main.addAFunction(objCineFunction);
			
		}
		catch( RuntimeException e){
			
		}
		
	}
	
	public void setMain(Main main) {
		this.main = main;
	}

}
