package il.co.moshavit.repository;

import il.co.moshavit.model.User;

public class UserRepository 
{	
	private DataBase db;
	
	public UserRepository() throws Exception
	{
		db  = new DataBase("db_moshvit");
	}
	
	public void insertToData(User user) throws Exception
	{
		//TODO Sync the add user
  		DataBase db = new DataBase("db_moshvit");
  		db.StoredProcdure("call add_user(?,?,?,?,?,?,?,?,?,?)");
  		
  		db.addParamString(1, user.getIdentityCard());
  		db.addParamString(2, user.getFirstName());
  		db.addParamString(3, user.getLastName());
  		db.addParamString(4, user.getEmail());
  		db.addParamString(5, user.getPhone());
  		db.addParamString(6, user.getPassword());
  		
  		db.addParamDate(7, user.getRegisterDate());
  		db.addParamDate(8, user.getDateOfBirth());
  		
  		//TODO to change to user.getIsMember() and user.getIsActive();
  		db.addParamBoolean(9, true);
  		db.addParamBoolean(10, false);
  		
  		db.execute();
	}
}
