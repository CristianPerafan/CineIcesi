package application;
	

import controller.LoginController;
import controller.MenuBarController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Users;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	@SuppressWarnings("unused")
	private Stage currentStage;
	private Users user;
	
	@Override
	public void start(Stage primaryStage) {
		user = new Users();
		user.addUser("admin","admin");
		try {
			showLogin();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showLogin() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Login.fxml"));
			BorderPane root;
			root = (BorderPane)loader.load();
			
			LoginController controller = loader.getController();
			
			controller.setMain(this);
			controller.setUsers(user);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("../ui/application.css").toExternalForm());
			
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
			currentStage = stage;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void showInitialViewAndBarMenu() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root;
			root = (BorderPane)loader.load();
			
			MenuBarController controller = loader.getController();
			controller.setMain(this);
			
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			
			stage.setScene(scene);
			
			currentStage.close();
			
			currentStage = stage;
			
			BorderPane newRoot;
			
			BorderPane initialView = (BorderPane)FXMLLoader.load(getClass().getResource("../ui/InitialView.fxml"));
			
			newRoot = (BorderPane)stage.getScene().getRoot();
			newRoot.setCenter(initialView);
			
			stage.show();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	


	
	public static void main(String[] args) {
		launch(args);
	}
}
