package il.co.moshavit.exception;

import javax.xml.ws.WebServiceException;

public class ExistUserException extends WebServiceException {

	public ExistUserException(String message) {
		super(message);
	}
}
