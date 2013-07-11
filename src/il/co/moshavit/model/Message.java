package il.co.moshavit.model;

import javax.xml.bind.annotation.XmlRootElement;
import org.joda.time.DateTime;

@XmlRootElement
public abstract class Message {
	
	private int idUser;
	private int idMessage;
	private String subject;
	private String content;
	private DateTime publish;
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getId() {
		return idMessage;
	}
	public void setId(int id) {
		this.idMessage = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	//TODO set the format of dd/MM/yyyy  
	//TODO setters and getter will work with string only
	public DateTime getPublish() {
		return publish;
	}
	public void setPublish(DateTime publish) {
		this.publish = publish;
	}	
}
