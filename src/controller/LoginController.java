package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import application.Main;
import exceptions.PasswordNotMatchException;
import exceptions.UserNotFoundException;
import model.Users;


public class LoginController {
	
	@SuppressWarnings("unused")
	private Main main;

	public LoginController() {
	}
	
	private Users users;
	
	@FXML
	private Button loginButton;
	
	@FXML
	TextField userField;
	
	@FXML
	PasswordField passwordField;
	
	public void LoginAction(ActionEvent event) {
		validateLogin();
	}
	
	public void validateLogin() {
		
		String user = userField.getText();
		
		String password = passwordField.getText();
		
		user = "admin";
		password = "admin";
		
		try {
			users.validate(user,password);
			main.showInitialViewAndBarMenu();
			
		}catch(UserNotFoundException | PasswordNotMatchException e){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error de ingreso!!");
			alert.setHeaderText("Usuario no registrado..");
			
			if(e instanceof UserNotFoundException) {
				alert.setContentText("El usuario no se encuentra registado");
			}
			else{
				alert.setContentText("La contraseña es incorrecta");
			}
			alert.showAndWait();
		}
		
		
	}
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void setUsers(Users users) {
		this.users = users;
	}
		

}
