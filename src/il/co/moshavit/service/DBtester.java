package il.co.moshavit.service;

import java.sql.ResultSet;

public class DBtester {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
	
		DataBase db_2 = new DataBase();
		ResultSet result;
		
		db_2.query("call selectAllTable()");
		result = db_2.resultQuery();
		
		while(result.next())
		{
			System.out.println(result.getString("idUser") + " " + result.getString("username"));
		}
		
	}

}
