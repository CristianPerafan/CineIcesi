package model;

import java.util.ArrayList;

public class IcesiCinema {
	
	//Relations
	@SuppressWarnings("unused")
	private Cinema miniRoom;
	
	@SuppressWarnings("unused")
	private Cinema mediumRoom;
	
	private ArrayList<CineFunction> functions;
	
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
	}

}
