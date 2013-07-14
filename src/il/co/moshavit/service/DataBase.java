package il.co.moshavit.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class DataBase {
	
	private Connection connection;
	private final String JDBC_DRIVER;
	private final String DATABASE_URL;
	private final String USERNAME;
	private final String PASSWORD;
	
	public DataBase() throws Exception
	{
		JDBC_DRIVER = Settings.getData("driver");
		DATABASE_URL = Settings.getData("url");
		USERNAME =  Settings.getData("username");
		PASSWORD = Settings.getData("password");
		
		Class.forName(JDBC_DRIVER);
		connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
	}
	
	public void create(String sql, String... values) throws Exception
	{
		PreparedStatement statement = connection.prepareStatement(sql);
		
		for(int index = 0 ; index < values.length ; index++)
		{
			statement.setString(index+1, values[index]);
		}
		
		statement.execute();
	}
	

}
