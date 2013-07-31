package il.co.moshavit.model;

import il.co.moshavit.repository.DataBase;

import javax.xml.bind.annotation.XmlRootElement;

import org.joda.time.DateTime;

@XmlRootElement
public class User {
	
  private int IdUser;
  private String identityCard;
  private String firstName;
  private String lastName;
  private String Email;
  private String Phone;
  private String Password;
  private DateTime RegisterDate;
  private DateTime dateOfBirth;
  private boolean isActive;
  private boolean isMember;
  
  public User()
  {
//	  TODO for test only to delete aftter testing
	  this.setRegisterDate();
	  this.setDateOfBirth();
  }

	public int getIdUser() {
		return IdUser;
	}

	public void setIdUser(int idUser) {
		IdUser = idUser;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public void setRegisterDate() {
		RegisterDate = new DateTime().now();
	}

	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth() {
		this.dateOfBirth = new DateTime().now();
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isMember() {
		return isMember;
	}

	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}  	
}
