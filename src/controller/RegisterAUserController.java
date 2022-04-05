package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Users;

public class RegisterAUserController {
	@SuppressWarnings("unused")
	private Main main;
	
	@FXML
	private TextField textFieldId;
	
	@FXML
	private TextField textFieldPassword;
	
	@FXML
	private Button saveButtton;
	
	public RegisterAUserController() {
		
	}
	
	public void saveAUser(ActionEvent e) {
		getAndSaveAUser();
	}
	
	public void getAndSaveAUser() {
		
		String id = textFieldId.getText();
		String password = textFieldPassword.getText();
		
		main.addANewUser(id, password);
		
		main.showInitialViewAndBarMenu();
	}

	public void setMain(Main main) {
		this.main = main;
	}
}
