package il.co.moshavit.DataBase;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;

public class DataBase {
	
	private Connection connection;
	private CallableStatement statement;
	
	/**
	 * Set connection for database
	 * @param driver
	 * @param url
	 * @param username
	 * @param password
	 * @throws Exception
	 */
	public DataBase(String driver, String url, String username, String password) throws Exception
	{
		 Class.forName(driver);
		 connection = (Connection) DriverManager.getConnection(url, username, password);
		
	}
	
	/**
	 * Call the Stored Procedure at The DataBase
	 * @param sql Stored Procedure Name
	 * @throws SQLException
	 */
	public void CallStoredProcedure(String sql) throws SQLException
	{
		statement = (CallableStatement) connection.prepareCall(sql);
	}
	
	/**
	 * Declare of the string parameter 
	 * @param param parameter name
	 * @param value insert value to database
	 * @throws SQLException
	 */
	public void AddString(String param, String value) throws SQLException
	{
		statement.setString(param, value);
	}
	
	/**
	 * Declare integer type parameter 
	 * @param param parameter name
	 * @param value insert value to database 
	 * @throws SQLException
	 */
	public void AddInt(String param, int value) throws SQLException
	{
		statement.setInt(param, value);
	}
	
	
	/**
	 * Declare boolean type parameter 
	 * @param param parameter name
	 * @param value insert value to database
	 * @throws SQLException
	 */
	public void AddBoolean(String param, boolean value) throws SQLException
	{
		statement.setBoolean(param, value);
	}
	
	/**
	 * Declare boolean type parameter 
	 * @param param parameter name
	 * @param value insert value to database
	 * @throws SQLException
	 */
	public void AddDateTime(String param, Date value) throws SQLException
	{
		statement.setDate(param, value);
	}
	
	/**
	 * Declare of output parameter (type integer)
	 * @param parameterIndex
	 * @throws SQLException
	 */
	public void RegisterParameterInt(String parameterName) throws SQLException
	{
		statement.registerOutParameter(parameterName, Types.INTEGER);
	}
	
	/**
	 * Declare of output parameter (type integer)
	 * @param parameterIndex
	 * @throws SQLException
	 */
	public void RegisterParameterString(String parameterName) throws SQLException
	{
		statement.registerOutParameter(parameterName, Types.VARCHAR);
	}
	
	/**
	 * Execute the Stored Procedure
	 * @throws SQLException
	 */
	public void Execute() throws SQLException
	{
		statement.execute();
	}
	
	/**
	 * Out the registered Parameter
	 * @param columName column 
	 * @return integer result
	 * @throws SQLException
	 */
	public int OutParamerterInt(String columnName) throws SQLException
	{
		return statement.getInt(columnName);
	}
	
	/**
	 * Out the registered Parameter
	 * @param columName column 
	 * @return String result
	 * @throws SQLException
	 */
	public String OutParamerterString(String columName) throws SQLException
	{
		return statement.getString(columName);
	}
	
	/**
	 * return the result from database
	 * @return ResultSet
	 * @throws SQLException
	 */
	public ResultSet resultSet() throws SQLException
	{
		return (ResultSet)statement.executeQuery();
	}
	
	public void Close() throws SQLException
	{
		connection.close();
	}

}
