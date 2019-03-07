package com.vimal.creation.singleton;

public class DbConnEarly {

	
	public static DbConnEarly dbConnection = new DbConnEarly();
	
	private DbConnEarly() {
		
	}
	

}
