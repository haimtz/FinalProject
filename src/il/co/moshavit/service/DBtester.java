package il.co.moshavit.service;

import java.sql.ResultSet;

public class DBtester {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		DataBase db = new DataBase();
		int txId = 0;
		
		db.query("call insert_table(?,?)");
		db.addParamString(1, "BEntzi___");
		db.addParamString(2, "KOKO_3A_+");
		
		
		db.create();
		
		
		DataBase db_2 = new DataBase();
		ResultSet result;
		
		db_2.query("call selectAllTable()");
		result = db_2.resultQuery();
		
		while(result.next())
		{
			System.out.println(result.getString("counterUser"));
		}
		
	}

}
