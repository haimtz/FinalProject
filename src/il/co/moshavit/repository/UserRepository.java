package il.co.moshavit.repository;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import il.co.moshavit.exception.ExistUserException;
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
		checkExistUser(user.getIdentityCard());
		//TODO Sync the add user
  		db.StoredProcdure("call add_user(?,?,?,?,?,?,?,?,?,?)");
  		
  		db.addParamString(1, user.getIdentityCard());
  		db.addParamString(2, user.getPrivatetName());
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
	
	public void checkExistUser(String identityCard) throws SQLException
	{		
		db.StoredProcdure("call select_by_identity_card(?)");
		db.addParamString(1, identityCard);
		
		if(db.resultQuery().next())
			throw new ExistUserException("The User Exist!!!");
	}
	
	public User getUser(String identity, String password) throws Exception
	{
		ResultSet result;
		
		db.StoredProcdure("call select_user(?,?)");
		db.addParamString(1, identity);
		db.addParamString(2, password);
		
		result = db.resultQuery();
		
		if(result.next())
		{
			return getResultUser(result);
		}
		
		return null;
	}
	
	private User getResultUser(ResultSet result) throws Exception
	{
		User user = new User();
		
		user.setIdUser(result.getInt("idUser"));
		
		user.setIdentityCard(result.getString("identityCard"));
		user.setPrivatetName(result.getString("firstName"));
		user.setLastName(result.getString("lastName"));
		user.setEmail(result.getString("email"));
		user.setPhone(result.getString("phone"));
		
		return user;
		
	}
}
