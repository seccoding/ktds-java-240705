package com.hucloud.lesson.java.printing;

/**
 * <pre>
 * 주석. (Document)
 * Document 주석 : 클래스나 메소드의 설명을 작성하는 주석.
 * 주석 : 코드의 실행과는 관계가 없는 설명을 위해 작성.
 * 
 * 클래스 : Java의 가장 기본적인 단위.
 * 새로운 파일을 만든다 ==> 새로운 클래스를 생성!.
 * </pre>
 */
public class Lesson01 {

	/**
	 * <pre>
	 * 자바 프로그램이 실행될 수 있도록 하는 메소드!
	 * </pre>
	 * 
	 * @param args 파라미터: 메소드가 실행될 때 전달할 인자정보.
	 */
	public static void main(String[] args) {
		/*
		 * Multi line 주석
		 * ㄴㅁㄹㅇ
		 * ㅁㄴㅇㄹ
		 * 
		 */
		
		// Ctrl + F11 : 실행.
		
		// 출력하는 코드 <-- // Single Line 주석. 한줄짜리 주석.
		System.out.println("출력하고 싶은 내용"); // 문자열 출력
		System.out.println(10); // 정수를 출력
		System.out.println(3.14); // 부동소수점 출력
		System.out.println(10 + 3.14); // 연산의 결과를 출력
		System.out.println(true); // 불리언을 출력
		System.out.println(false); // 각 명령의 가장 마지막에는 ; 으로 마무리!
		
		// 문자열과 비문자열을 더하면 결과는 항상 문자열.
		System.out.println("문자열입니다. " + 10); // 문자!
		System.out.println("5 + 3 의 결과는 " + 5 + 3 + "입니다.");
		System.out.println("5 + 3 의 결과는 " + (5 + 3) + "입니다.");
		
		int a = 9;
		a = a + 1;
		a += 1;
		a++; // 현재 변수에 1을 더하는 연산.
		
		int b = 10;
		b = b - 1;
		b--; // 현재 변수에서 1을 빼는 연산.
		
		a = a + 2;
		a += 2;
		
		
	}
}
