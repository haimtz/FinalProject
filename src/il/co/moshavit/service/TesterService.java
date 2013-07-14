package il.co.moshavit.service;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class TesterService {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		String procdure = "INSERT INTO temp_db.User (username, family) VALUES (?, ?)";
		
		String name = "name";
		Integer num = 6;
		
		DataBase db = new DataBase();
		db.create(procdure, name, num.toString());

	}

}
