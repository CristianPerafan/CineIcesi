package controller;

import application.Main;

public class MenuBarController {
	
	private Main main;

	public MenuBarController() {
		// TODO Auto-generated constructor stub
	}
	
	public void returnHome() {
		main.showInitialViewAndBarMenu();
	}
	
	public void registerAFunction(){
		main.ShowRegisterAFunction();
	}
	
	public void registerAUser() {
		main.registerAUser();
	}
	
	
	
	public void setMain(Main main) {
		this.main = main;
	}

}
