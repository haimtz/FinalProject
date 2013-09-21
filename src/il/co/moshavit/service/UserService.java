package il.co.moshavit.service;

import java.sql.SQLException;
import java.util.ResourceBundle;

import il.co.moshavit.DataBase.DataBase;
import il.co.moshavit.DataBase.IService;
import il.co.moshavit.model.User;

public class UserService implements IService {

	private DataBase Data;
	
	public UserService() throws Exception
	{
		this.initialize();
	}
	
	private void initialize() throws Exception {
		
		ResourceBundle bundel = ResourceBundle.getBundle("connection_config");
		
		// call parameters for config.properties file
		String _driver = bundel.getString("driver.name");
		String _url = bundel.getString("server.url") + bundel.getString("database.name");
		String _username = bundel.getString("user.name");
		String _password = bundel.getString("user.password");
		
		Data = new DataBase(_driver, _url, _username, _password);
		
	}

	@Override
	public <T> int Create(T t)
	{
		
		if(!(t instanceof User))
			return -1;
		
		int _id = 0;
		
		try {
			Data.CallStoredProcedure("{ call insert_user(?,?) }");
			
			Data.AddString("p_username", ((User)t).getFirstName());
			Data.RegisterParameterInt("p_id");
			Data.Execute();
			
			_id = Data.OutParamerterInt("p_id");
			
			Data.Close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return _id;
	}

	@Override
	public <T> Iterable<T> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void Update(int id, T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void Delete(int id, T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T Get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
