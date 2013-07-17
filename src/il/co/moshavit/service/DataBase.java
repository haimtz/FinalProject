package il.co.moshavit.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.joda.time.DateTime;
import org.xml.sax.SAXException;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.ResultSet;

public class DataBase {
	
	private Connection connection;
	private final String JDBC_DRIVER;
	private final String DATABASE_URL;
	private final String USERNAME;
	private final String PASSWORD;
	
	private Statement statement = null;
	private PreparedStatement preper = null;
	
	public DataBase() throws Exception
	{
		// database settings
		JDBC_DRIVER = Settings.getData("driver");
		DATABASE_URL = Settings.getData("url");
		USERNAME =  Settings.getData("username");
		PASSWORD = Settings.getData("password");		
		
		// Register JDBC driver
		Class.forName(JDBC_DRIVER);
				
		// Open connection
		connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
	}
	
	public void query(String sql) throws SQLException
	{
		preper = connection.prepareStatement(sql);
	}
	
	public void addParamString(int index, String value) throws SQLException
	{
		preper.setString(index, value);
	}
	
	public void addParamInt(int index, int value) throws SQLException
	{
		preper.setInt(index, value);
	}
	
	public void addParamDate(int index, DateTime value) throws SQLException
	{
		preper.setDate(index, new Date(value.toDate().getTime()));
	}
	
	public void create() throws SQLException
	{
		preper.execute();
	}
	
	public ResultSet resultQuery() throws SQLException
	{
		ResultSet result = null;		
		result = (ResultSet) preper.executeQuery();
		
		return result;
	}

}
