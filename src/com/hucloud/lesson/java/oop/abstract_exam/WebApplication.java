package com.hucloud.lesson.java.oop.abstract_exam;

public class WebApplication {

	public static void main(String[] args) {
		
		String fileName = "java.logo.sh";
		
		FileCheck fileCheck = new MimeCheck();
		boolean isAvailable = fileCheck.isAvailable(fileName);
		
		if (isAvailable) {
			System.out.println("업로드를 할 수 있습니다.");
		}
		else {
			System.out.println("업로드를 할 수 없습니다.");
		}
		
	}
	
}
