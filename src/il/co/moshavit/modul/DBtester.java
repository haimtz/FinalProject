package il.co.moshavit.modul;

import il.co.moshavit.model.User;

import java.sql.ResultSet;

public class DBtester {

	/**
	 * for tests only 
	 */
	public static void main(String[] args) throws Exception {
		
//		DataBase db = new DataBase("db_moshvit");
//		db.StoredProcdure("call insert_test(?,?)");
//		db.addParamString(1, "WER 2");
//		db.addParamString(2, "MBN 2");
//		db.execute();
		
		DataBase db2 = new DataBase("db_moshvit");
  		db2.StoredProcdure("call add_test(?)");
  		
  		User user = new User();
		
		user.setIdentityCard("324324");
		user.setFirstName("AAA");
		user.setLastName("BBBB");
		user.setEmail("mail@mail.com");
		user.setPhone("0988888");
		user.setRegisterDate();
		user.setDateOfBirth();
		user.setActive(true);
		user.setMember(false);
		
  		db2.addParamString(1, user.getIdentityCard());
//  		db21.addParamString(2, user.getFirstName());
//  		db21.addParamString(3, user.getLastName());
//  		db21.addParamString(4, user.getEmail());
//  		db21.addParamString(5, user.getPhone());
//  		db21.addParamString(6, user.getPassword());
//  		
//  		db21.addParamDate(7, user.getRegisterDate());
//  		db21.addParamDate(8, user.getDateOfBirth());
//  		
//  		db21.addParamBoolean(9, user.isMember());
//  		db21.addParamBoolean(10, user.isActive());
  		
  		db2.execute();
		
//		DataBase db = new DataBase("temp_db");
//		db.StoredProcdure("call insert_table(?,?,?)");
//		db.addParamString(1, "Haim AAA");
//		db.addParamString(2, "Tz");
//		db.addParamBoolean(3, false);
//		db.execute();
//		
//		DataBase db_2 = new DataBase("temp_db");
//		ResultSet result;
//		
//		db_2.StoredProcdure("call selectAllTable()");
//		result = db_2.resultQuery();
//		
//		while(result.next())
//		{
//			System.out.println(result.getString("idUser") + " " + result.getString("username") 
//								+ " " + result.getBoolean("isTrue"));
//		}
		
	}
}
