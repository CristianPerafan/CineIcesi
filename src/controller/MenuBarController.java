package controller;

import application.Main;

public class MenuBarController {
	
	private Main main;

	public MenuBarController() {
		// TODO Auto-generated constructor stub
	}
	
	public void registerAFunction(){
		main.showLogin();
	}
	
	
	
	public void setMain(Main main) {
		this.main = main;
	}

}
