package il.co.moshavit.model;

import javax.xml.bind.annotation.XmlRootElement;
import org.joda.time.DateTime;

@XmlRootElement
public class CarPull extends Message {
	
	private String form;
	private String destination;
	private DateTime returnTime;
	
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public DateTime getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(DateTime returnTime) {
		this.returnTime = returnTime;
	}
}
