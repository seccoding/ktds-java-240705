package com.hucloud.lesson.java.oop.abstract_exam;

import java.util.Random;

/**
 * 파일의 마임타입을 체크.
 */
public class MimeCheck extends FileCheck {

	@Override
	public String getType(String fileName) {
		
		String[] mimetypeArray = {
				"image/jpeg", "image/png", "image/gif"
				, "application/json"
		};
		
		// 지정 범위까지의 난수를 생성 클래스
		// java.util.Random
		Random rand = new Random();
		int randomIndex = rand.nextInt(4); // 0 ~ 3 중 임의의 숫자 생성.
		
		System.out.println(mimetypeArray[randomIndex]);
		
		return mimetypeArray[randomIndex];
	}

	@Override
	public boolean matches(String type) {
		return type.equals("image/jpeg") || type.equals("image/png") || type.equals("image/gif");
	}

}
