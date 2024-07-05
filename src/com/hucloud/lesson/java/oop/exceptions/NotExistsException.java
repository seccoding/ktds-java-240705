package com.hucloud.lesson.java.oop.exceptions;

/**
 * 파일이 존재하지 않을 때 발생하는 예외.
 */
public class NotExistsException extends RuntimeException {

	private static final long serialVersionUID = -8822452982500994607L;

	public NotExistsException(String message) {
		super(message);
	}
	
}
