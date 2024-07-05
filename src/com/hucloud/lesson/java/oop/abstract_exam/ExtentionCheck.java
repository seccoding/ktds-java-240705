package com.hucloud.lesson.java.oop.abstract_exam;

/**
 * 확장자를 검사하는 클래스.
 */
public class ExtentionCheck extends FileCheck {

	@Override
	public String getType(String fileName) {
		int dotIndex = fileName.lastIndexOf(".");
		String ext = fileName.substring(dotIndex);
		System.out.println(ext);
		return ext;
	}

	@Override
	public boolean matches(String type) {
		return type.equalsIgnoreCase(".png") 
				|| type.equalsIgnoreCase(".jpeg") 
				|| type.equalsIgnoreCase(".gif");
	}

}
