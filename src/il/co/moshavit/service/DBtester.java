package il.co.moshavit.service;

import java.sql.ResultSet;

public class DBtester {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		DataBase db = new DataBase("temp_db");
		db.StoredProcdure("call insert_table(?,?,?)");
		db.addParamString(1, "Haim AAA");
		db.addParamString(2, "Tz");
		db.addParamBoolean(3, false);
		db.execute();
		
		DataBase db_2 = new DataBase("temp_db");
		ResultSet result;
		
		db_2.StoredProcdure("call selectAllTable()");
		result = db_2.resultQuery();
		
		while(result.next())
		{
			System.out.println(result.getString("idUser") + " " + result.getString("username") 
								+ " " + result.getBoolean("isTrue"));
		}
		
	}
}
