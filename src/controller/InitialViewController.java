package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import application.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.*;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class InitialViewController {

	public InitialViewController() {
		// TODO Auto-generated constructor stub
	}
	private Main main; 
	private ArrayList<CineFunction> aux = new ArrayList<>(); 
    @FXML
    private TableView<CineFunction> tablaFunciones = new TableView<>();

    @FXML
    private TableColumn<CineFunction,String> columnaNombre;

    @FXML
    private TableColumn<CineFunction,LocalDate> columnaFecha;

    @FXML
    private TableColumn<CineFunction,LocalDate> columnaInicio;

    @FXML
    private TableColumn<CineFunction,LocalDate> columnaFin;
    @FXML
    private Button bRefresh;

	@FXML
	public void initialize() {
	    columnaNombre.setCellValueFactory(new PropertyValueFactory<>("name"));
	    columnaFecha.setCellValueFactory(new PropertyValueFactory<>("date"));
	    columnaInicio.setCellValueFactory(new PropertyValueFactory<>("startTime"));
	    columnaFin.setCellValueFactory(new PropertyValueFactory<>("endTime"));
	}
	public void refreshDataFunctions(ActionEvent e) {
		
		refreshDatosNew();
	}
	public void refreshDatosNew() {
		tablaFunciones.setItems(main.getDatasFunction());
	}
	
	public void setMain(Main main) {
		this.main = main;
	}
}
