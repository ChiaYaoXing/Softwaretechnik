package application;

import dbadapter.DB_Facade;

import interfaces.UCmds;

public class MRA_App implements UCmds{
	
	private static MRA_App instance;
	public static MRA_App getInstance() {
		if (instance == null) {
			instance = new MRA_App();
		}

		return instance;
	}	

	@Override
	public boolean requestRegistration(String name, int age, String email) {
		
		boolean success=true; 
		
		String nameSQL=name;
		int ageSQL=age;
		String emailSQL=email;
		 
		if(DB_Facade.getInstance().addUser(nameSQL,ageSQL,emailSQL))
		{return success;}
		else {
		 
		return false;}
		 
	}

}
