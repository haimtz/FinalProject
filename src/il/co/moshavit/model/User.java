package il.co.moshavit.model;

import org.joda.time.DateTime;

public class User {
  private int IdUser;
  private String UserName;
  private String Family;
  private String Email;
  private String Phone;
  private String Password;
  private DateTime RegisterDate;
  
  
	public int getIdUser() {
		return IdUser;
	}
	public void setIdUser(int idUser) {
		IdUser = idUser;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getFamily() {
		return Family;
	}
	public void setFamily(String family) {
		Family = family;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public DateTime getRegisterDate() {
		return RegisterDate;
	}
	public void setRegisterDate(DateTime registerDate) {
		RegisterDate = registerDate;
	}  

}
