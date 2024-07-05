package com.hucloud.lesson.java.oop.abstract_exam;

/**
 * 웹 애플리케이션을 개발.
 * 
 * 파일 업로드 구현.
 *  - 확장자를 체크해서 실행가능한 파일들을 업로드에서 제외.
 *  - 확장자 화이트리스트 관리 - 화이트리스트에 있는 파일 타입만 업로드를 할 수 있도록.
 */
public abstract class FileCheck {

	// 업로드된 파일의 확장자를 체크.
	// test.png ==> ".png"
	/**
	 * 업로드 가능한 파일인지 체크. (확장자만 체크)
	 * @param fileName 업로드 하려는 파일의 이름.
	 * @return 업로드 가능한지에 대한 여부.
	 */
	public boolean isAvailable(String fileName) {
		String type = this.getType(fileName);
		return this.matches(type);
		
//		// 확장자를 가져오는 코드
//		//                    01234567
//		// 만약 fileName의 값이 "test....test.PNG" ==> ".png" 부분만 추출.
//		int dotIndex = fileName.lastIndexOf(".");
//		String ext = fileName.substring(dotIndex);
//		System.out.println(ext);
//		
//		// 확장자를 검사하는 코드.
//		// 확장자의 값이 ".png", ".jpeg", ".gif" 인 경우만 true로 반환.
//		return ext.equalsIgnoreCase(".png") || ext.equalsIgnoreCase(".jpeg") || ext.equalsIgnoreCase(".gif");
	}
	
	// 추상 메소드.
	/**
	 * 확장자 또는 마임타입 또는 DRM여부등을 가져오는 코드
	 * @param fileName
	 * @return
	 */
	public abstract String getType(String fileName);
	
	/**
	 * 확장자 또는 마임타임 또는 DRM여부를 통해 업로드 가능한지 검사하는 코드.
	 * @param type
	 * @return
	 */
	public abstract boolean matches(String type);
	
	
}







