package application;
	
import java.io.IOException;
import java.util.ArrayList;

import controller.InitialViewController;
import controller.LoginController;
import controller.MenuBarController;
import controller.RegisterAFunctionController;
import controller.RegisterAUserController;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import model.IcesiCinema;
import model.Users;
import model.CineFunction;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private Stage currentStage;
	private Users user;
	
	//Model Controller
	private IcesiCinema modelController;
	
	@Override
	public void start(Stage primaryStage) {
		user = new Users();
		
		user.addUser("admin","admin");
		
		modelController = new IcesiCinema();
		
		try {
			showLogin();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addANewUser(String id, String password) {
		user.addUser(id,password);
	}
	
	public void showLogin() {
		try {
			
			
			if(currentStage != null) {
				currentStage.close();
			}
			
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
			FXMLLoader loader1 = new FXMLLoader(getClass().getResource("../ui/InitialView.fxml"));
			BorderPane initialView = (BorderPane)loader1.load();
			InitialViewController ivc = loader1.getController();
			ivc.setMain(this);
			
			newRoot = (BorderPane)stage.getScene().getRoot();
			newRoot.setCenter(initialView);
			
			stage.show();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void ShowRegisterAFunction() {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root = (BorderPane)loader.load();
			
			MenuBarController barController = loader.getController();
			barController.setMain(this);
			
			Scene scene = new Scene(root);
			
			Stage stage = new Stage();
			
			stage.setScene(scene);
			
			currentStage.close();
			
			BorderPane newRoot;
			
			/////
			FXMLLoader registerLoader = new FXMLLoader(getClass().getResource("../ui/RegisterAFunction.fxml"));
			BorderPane registerView = (BorderPane)registerLoader.load();
			
			RegisterAFunctionController registerController = registerLoader.getController();
			
			registerController.setMain(this);
			
			newRoot = (BorderPane)stage.getScene().getRoot();
			
            newRoot.setCenter(registerView);
			
			currentStage = stage;
			
			stage.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registerAUser() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MenuBar.fxml"));
			BorderPane root = (BorderPane)loader.load();
			
			MenuBarController barController = loader.getController();
			barController.setMain(this);
			
			Scene scene = new Scene(root);
			
			Stage stage = new Stage();
			
			stage.setScene(scene);
			
			currentStage.close();
			
			BorderPane newRoot;
			
			/////
			FXMLLoader registerUserLoader = new FXMLLoader(getClass().getResource("../ui/RegisterAUser.fxml"));
			BorderPane registerView = (BorderPane)registerUserLoader.load();
			
			RegisterAUserController registerUserController = registerUserLoader.getController();
			
			registerUserController.setMain(this);
			
			newRoot = (BorderPane)stage.getScene().getRoot();
			
            newRoot.setCenter(registerView);
			
			currentStage = stage;
			
			stage.show();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void toSerializeUser() {
		
	}
	
	public ObservableList<CineFunction>getDatasFunction(){
		ObservableList<CineFunction> aux = modelController.getDatos();
		return aux;
	}
	public ArrayList<CineFunction>getDatasFunction2(){

		return modelController.getDaticos();
	}
	
	public boolean validateDataFunctions() {
		if(modelController.getDatos()==null) {
			return true; 
		}else {
			return false;
		}
	}
	

	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void addAFunction(CineFunction function) {
		modelController.addAFunction(function);
	}
}
