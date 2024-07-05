package com.hucloud.lesson.java.oop.static_exam;

/**
 * 문자열과 관련된 유틸리티 모음.
 */
public class StringUtils {

	/**
	 * 클래스 메소드.
	 * 파라미터 source가 null인지 체크.
	 * 파라미터 source가 비어있는 문자열인지 체크.
	 * 
	 * @param source
	 * @return
	 */
	static boolean isEmpty(String source) {
//		boolean isEmpty = source == null;
//		isEmpty |= source.equals("");
		
		boolean isEmpty = source == null || source.equals("");
		return isEmpty;
	}
	
	/**
	 * 파라미터 source가 null일 때 파라미터 value로 반환.
	 * 파라미터 source가 null이 아니면, source를 그대로 반환.
	 * 
	 * @param source
	 * @param value
	 * @return
	 */
	static String nullToDefaultValue(String source, String value) {
		String tempValue = source == null ? value : source;
		return tempValue;
	}
	
	/**
	 * 파라미터 source가 숫자로만 이루어져있는지 확인.
	 * @param source
	 * @return
	 */
	static boolean isNumber(String source) {
		return source.matches("^[0-9]+$");
	}
	
}
