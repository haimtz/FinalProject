package il.co.moshavit.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.joda.time.DateTime;
import org.junit.Ignore;

@XmlRootElement
public class User {
	
  private int IdUser;
  private String identityCard;
  private String FirstName;
  private String lastName;
  private String Email;
  private String Phone;
  private DateTime RegisterDate;
  private DateTime dateOfBirth;
  private boolean isActive;
  private boolean isMember;
  
  public User()
  {
//	  TODO for test only to delete after testing
	  this.setRegisterDate(DateTime.now());
	  this.setDateOfBirth(DateTime.now());
  }

	public int getIdUser() {
		return IdUser;
	}
	
	public void setIdUser(int idUser) {
		IdUser = idUser;
	}
	
	public String getIdentityCard() {
		return identityCard;
	}
	
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
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
	
	public DateTime getRegisterDate() {
		return RegisterDate;
	}
	
	public void setRegisterDate(DateTime registerDate) {
		RegisterDate = registerDate;
	}
	
	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
}
