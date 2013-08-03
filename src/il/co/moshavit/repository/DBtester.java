package il.co.moshavit.repository;

import il.co.moshavit.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBtester {

	/**
	 * for tests only 
	 */
	public static void main(String[] args) throws Exception {
		
		
		DataBase db = new DataBase("temp_db");
		db.StoredProcdure("call insert_table(?,?,?)");
		db.addParamString(1, "TEST RESULT");
		db.addParamString(2, "Tz");
		db.addParamBoolean(3, false);
		db.execute();
		
		DataBase db_2 = new DataBase("temp_db");
		ResultSet result;
		
		db_2.StoredProcdure("call selectAllTable()");
		result = db_2.resultQuery();
		
		while(result.next())
		{
			printResult(result);
		}
		
	}
	
	public static void printResult(ResultSet result) throws SQLException
	{
		System.out.println(result.getString("idUser") + " " + result.getString("username") 
				+ " " + result.getBoolean("isTrue"));
	}
}
