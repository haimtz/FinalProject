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
		//TODO Sync the add user
//  		DataBase db = new DataBase("db_moshvit");
//  		db.StoredProcdure("call add_user(?,?,?,?,?,?,?,?,?,?)");
//  		
//  		db.addParamString(1, this.identityCard);
//  		db.addParamString(2, this.firstName);
//  		db.addParamString(3, this.lastName);
//  		db.addParamString(4, this.Email);
//  		db.addParamString(5, this.Phone);
//  		db.addParamString(6, this.Password);
//  		
//  		db.addParamDate(7, this.RegisterDate);
//  		db.addParamDate(8, this.dateOfBirth);
//  		
//  		db.addParamBoolean(9, this.isMember);
//  		db.addParamBoolean(10, this.isActive);
//  		
//  		db.execute();
	}
}
