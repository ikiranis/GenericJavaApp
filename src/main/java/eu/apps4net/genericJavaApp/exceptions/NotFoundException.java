package eu.apps4net.genericJavaApp.exceptions;

public class NotFoundException extends RuntimeException {
	public NotFoundException(String message) {
		super(message);
	}
}
