package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class IcesiCinema {
	
	//Relations
	@SuppressWarnings("unused")
	private Cinema miniRoom;
	
	@SuppressWarnings("unused")
	private Cinema mediumRoom;
	
	private ArrayList<CineFunction> functions;
	ObservableList <CineFunction> itemsFunctions = FXCollections.observableArrayList();
	
	public IcesiCinema() {
		
		//Mini-room relation
		miniRoom = new Cinema(4,7);
		
		//Medium room relation
		mediumRoom = new Cinema(6,7);
		
		//Functions of Icesi Cinema
		functions = new ArrayList<CineFunction>();
		
	}
	
	public void addAFunction(CineFunction function) {
		functions.add(function);
		itemsFunctions.add(function);
		serializeFunction();
	}
	
	public void serializeFunction() {
		File file = new File(".\\files\\Funciones.csv");
		FileWriter fileW = null;
		try {
			fileW = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedWriter output = new BufferedWriter(fileW);
		
		try {
			output.write("Hello");
			output.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public ObservableList<CineFunction> getDatos(){
		return itemsFunctions; 
	}
	
	public ArrayList<CineFunction> getDaticos(){
		return functions; 
	}
	
}