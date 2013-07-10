package il.co.moshavit.model;

import org.joda.time.DateTime;

public abstract class Message {
	
	private int idUser;
	private int id;
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
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public DateTime getPublish() {
		return publish;
	}
	public void setPublish(DateTime publish) {
		this.publish = publish;
	}	
}
