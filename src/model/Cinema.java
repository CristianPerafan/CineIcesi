package model;

public class Cinema {
	
	//Relations
	@SuppressWarnings("unused")
	private Chairs [][] chairs;
	
	public Cinema( int numRows,int numColumns) {
		chairs = new Chairs[numRows][numColumns];
	}

}
