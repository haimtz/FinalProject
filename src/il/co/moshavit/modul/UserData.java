package il.co.moshavit.modul;

import il.co.moshavit.model.User;

public class UserData 
{	
	private DataBase db;
	
	public UserData() throws Exception
	{
		db  = new DataBase("db_moshvit");
	}
	
	public void insertToData(User user)
	{
		
	}
}
