package com.hucloud.lesson.java.oop.exceptions;

/**
 * 파일을 읽을 때, 전달된 파일이 txt 파일이 아닐 경우 던져질 예외.
 */
public class NotTextFileException extends RuntimeException {

	private static final long serialVersionUID = -6325350770074659605L;

	private String fileName;
	
	public NotTextFileException(String message) {
		super(message);
	}
	
	public NotTextFileException(String message, String fileName) {
		super(message);
		this.fileName = fileName;
	}
	
	@Override
	public String getMessage() {
		String message = super.getMessage();
		message += " [" + this.fileName + "]";
		return message;
	}
	
}








