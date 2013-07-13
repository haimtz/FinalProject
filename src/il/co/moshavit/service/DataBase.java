package il.co.moshavit.service;

import java.sql.*;

public class DataBase {
	
	private Connection conn;
	private Statement statment;
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private final String DATABASE_URL = "jdbc:mysql://localhost:3306/tempdb";
	private final String USERNAME = "root";
	private final String PASSWORD = "1234";
	
	public DataBase() throws Exception
	{
		try{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
			
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	

}
