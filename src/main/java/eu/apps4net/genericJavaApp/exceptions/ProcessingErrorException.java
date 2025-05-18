package eu.apps4net.genericJavaApp.exceptions;

public class ProcessingErrorException extends RuntimeException {
	public ProcessingErrorException(String message) {
		super(message);
	}
}
