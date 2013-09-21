package il.co.moshavit.service;

import il.co.moshavit.model.User;

public class Tester {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		User user = new User();
		
		user.setFirstName("Koko5456");
		
		UserService us = new UserService();
		
		int id = us.Create(user);
		
		System.out.println("ID: " + id);

	}

}
